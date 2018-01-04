<!DOCTYPE html> 
<html xmlns:th="http://www.thymeleaf.org">
 <%@page import="java.sql.*" %>
 <%@page import="java.io.*" %>
<head>
	<meta charset="UTF-8"/>
	<title>History</title>
</head>
<body>
	<h2>History</h2>
	<table>
		<thead>
			<th>Transaction ID</th>
			<th>Nama Penginap</th>
			<th>Room Number</th>
			<th>Cash</th>
			<th>Total Penginap Bulan Januari 2017</th>
			<th>Total Penginap Bulan Februari 2017</th>
			<th>Total Penginap Bulan Maret 2017</th>
			<th>Total Penginap Bulan April 2017</th>
			<th>Total Penginap Bulan Mei 2017</th>
			<th>Total Penginap Bulan Juni 2017</th>
			<th>Total Penginap Bulan Juli 2017</th>
			<th>Total Penginap Bulan Agustus 2017</th>
			<th>Total Penginap Bulan September 2017</th>
			<th>Total Penginap Bulan Oktober 2017</th>
			<th>Total Penginap Bulan November 2017</th>
			<th>Total Penginap Bulan Desember 2017</th>
			<th>Total Pemasukan Bulan Januari 2017</th>
			<th>Total Pemasukan Bulan Februari 2017</th>
			<th>Total Pemasukan Bulan Maret 2017</th>
			<th>Total Pemasukan Bulan April 2017</th>
			<th>Total Pemasukan Bulan Mei 2017</th>
			<th>Total Pemasukan Bulan Juni 2017</th>
			<th>Total Pemasukan Bulan Juli 2017</th>
			<th>Total Pemasukan Bulan Agustus 2017</th>
			<th>Total Pemasukan Bulan September 2017</th>
			<th>Total Pemasukan Bulan Oktober 2017</th>
			<th>Total Pemasukan Bulan November 2017</th>
			<th>Total Pemasukan Bulan Desember 2017</th>
			<th>Total Penginap Tahun 2017</th>
			<th>Total Pemasukan Tahun 2017</th>
		</thead>
		<tbody>
			<th:block th:each="transaction : ${transactionList}">
			String url = "jdbc:mysql://localhost:3306/sisfo";
 			Connection con = null;
 			Statement stat = null;
 			ResultSet rs = null;
 
 			Class.forName("com.mysql.jdbc.Driver").newInstance();
 
			con = DriverManager.getConnection(url, "root", "");
 
			stat = con.createStatement();
			String query = "select count(*) from reservation where check_out >= '2017-1-01 00:00:00' AND check_out < '2017-2-01 00:00:00';";
 
			rs = stat.executeQuery(query);
				<tr>
					<%=rs.getString(1)%>
				</tr>
			</th:block>
		</tbody>
	</table>
</body>
</html>