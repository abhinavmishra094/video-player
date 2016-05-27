


<%@page import="javax.servlet.annotation.MultipartConfig"%>
<%@page import="javax.servlet.annotation.WebServlet"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream"%>
<%@page import="java.io.SequenceInputStream"%>

<%@page import="java.io.FileInputStream"%>

<%@page import="java.sql.*;import my.Connect;" %>
 
 

<%     
  
  
   
   
   
  try
  {
           Connection con=Connect.getconnection();
           String s1,s2,s3,s4,s5,s6,s7;
          /* String contentType = request.getContentType();
if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0)) {

DataInputStream in = new DataInputStream(request.getInputStream());
int formDataLength = request.getContentLength();

 byte dataBytes[]= new byte[formDataLength];
int byteRead = 0;
int totalBytesRead = 0;
while (totalBytesRead < formDataLength) {
byteRead = in.read(dataBytes, totalBytesRead, formDataLength);
totalBytesRead += byteRead;
}
*/        /* FileOutputStream f1=new FileOutputStream("a1.jpg");
           ByteArrayOutputStream b1= new ByteArrayOutputStream();
          // SequenceInputStream s=new SequenceInputStream(f1);
           byte b[]=request.getParameter("img").getBytes();
           b1.writeTo(f1);*/
          // InputStream inputStream = null;
           String s8 =request.getParameter("pid");
            s1=request.getParameter("date");
           s2=request.getParameter("p_n");    
           s3=request.getParameter("cat");
           int p=Integer.parseInt(request.getParameter("price"));
           s5=request.getParameter("desc");
          s6=request.getParameter("img");
          s7=request.getParameter("bnd");
            PreparedStatement ps= con.prepareStatement("Insert into product values (?,?,?,?,?,?,?,?)");
           Part filePart = request.getPart("img");
         /*  if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }*/
            ps.setString(1,s2 );
           ps.setString(2,s3 );
           ps.setInt(3,p );
           ps.setString(4,s5 );
           ps.setString(6,s1 );
           /*if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                ps.setBlob(5, inputStream);
            }*/
           ps.setString(7,s7 );
           ps.setInt(8,Integer.parseInt(s8));
            int i=ps.executeUpdate();
           if(i>0 )
         {
         response.sendRedirect("admin.jsp");
         }
}

catch(Exception e)
      {
        out.println(e.getMessage());
      }
%>
