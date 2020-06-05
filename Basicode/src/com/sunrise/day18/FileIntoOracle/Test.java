package com.sunrise.day18.FileIntoOracle;

import oracle.sql.BLOB;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Test {
	public static void main(String[] arg){
		try { 
			File myFiles = new File("D:/6102-2");
			
			DBConnection dbc = new DBConnection();
			Connection conn = dbc.getConnection();
			readFile(myFiles,conn);
        	dbc.closeConnection(conn);
        	
		} catch (Exception e) {
			System.err.println("error is:  " + e.getMessage());
			System.out.println("--------");
			e.printStackTrace();
		} 
	}
	
	/**
	 * 
	 * <br>Description:???????????????????????????????????
	 * <br>Date:2012-10-15
	 * @param file
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void readFile(File file,Connection conn) throws ClassNotFoundException, SQLException, IOException{
		if(file.isFile()){
			dbOperate(file,conn);
		}else{
			File[] filesList = file.listFiles();
			for(int i=0;i<filesList.length;i++){
				readFile(filesList[i],conn);
			}
		}
	}

	public static String dbOperate(File file,Connection conn) throws ClassNotFoundException, SQLException, IOException{
//		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//		String url = "jdbc:odbc:orcl";
//		Connection con = DriverManager.getConnection(url, "zfbzfj", "zfbzfj"); 
//		Statement stmt = con.createStatement();
//		stmt.executeUpdate("CREATE TABLE COFFEES " + 
//				"(COF_NAME VARCHAR(32), SUP_ID INTEGER, PRICE FLOAT, " + 
//				"SALES INTEGER, TOTAL INTEGER)"); 
//		stmt.close();
//		con.close();
		
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//String url = "jdbc:oracle:thin:@192.168.0.252:1521:ORCL";
		//Connection conn = DriverManager.getConnection(url, "zfbzfj", "zfbzfj"); 
		//Statement stmt = conn.createStatement();

		//DBFactory db = new DBFactory();
		//DBConnection dbc = db.getDBConnectionInstance();
		//Connection conn = dbc.getConnection();
		
		String fileName = file.getName();
		String id = "";
		String type = "";
		String number = "";
		fileName = fileName.trim();
		String[] filens = fileName.split("-");
		int k = filens.length;
		if(k<2){
			System.out.println(file.getPath());
			return null;
		}else if(k==2){
			id = filens[0];
			type = filens[1].substring(0,filens[1].lastIndexOf("."));
			number = "0";
		}else if(k>2){
			id = filens[0];
			type = filens[1];
			number = filens[2].substring(0,filens[2].lastIndexOf("."));
		}
		if("????".equals(type)||"??????".equals(type)||"???".equals(type)||"???".equals(type)||"?????".equals(type)||"????".equals(type)){
			type = "21"; //12
		}else if("?????".equals(type)||"????".equals(type)||"??????".equals(type)||"????1".equals(type)||"????2".equals(type)||"????3".equals(type)||"????4".equals(type)){
			type = "22"; //14
		}else if("????".equals(type)||"???".equals(type)){
			type = "23"; //19
		}else if ("???????".equals(type)||"?????".equals(type)||"??????".equals(type)||"???".equals(type)||"???????".equals(type)||"????????????".equals(type)||"?????????????".equals(type)||"??????????".equals(type)||"???????".equals(type)){
			type = "41"; //??????????????????????????????????????????????????????????????????????????????????
		}
		String fid = "DR"+id+type+number;
		String sqlyw = "insert into gg_file_info_proc(fileid,dirid,filename,procid,status,uploaddate) values" +
				"('"+fid+"','"+type+"','"+fileName+"','"+id+"','1',sysdate)";
		System.out.println(sqlyw);
		String sqlfj = "insert into filestorage(id,flag,data) values('"+fid+"','1',empty_blob())";

		try{
		Statement stmt = conn.createStatement();
		int yw = stmt.executeUpdate(sqlyw);
		int fj = stmt.executeUpdate(sqlfj);
		
		OutputStream os = null;
		FileInputStream is = new FileInputStream(file);
		
		ResultSet rs = stmt.executeQuery("select data from filestorage where id='" + fid + "' for update");
        if (rs.next()) {
            BLOB blob = (BLOB) rs.getBlob("data");
            os = blob.getBinaryOutputStream();
            int b = is.read();
            do {
                os.write(b);
                b = is.read();
            } while (b != -1);
            os.flush();
            os.close();
            os = null;
        }
		conn.commit();
		if(fj==1&&yw==1){
			System.out.println("???????:"+file.getPath());
		}
		}catch (Exception e) {
        	conn.close();
            e.printStackTrace();
        } finally {
        }
		return null;
	}
}
