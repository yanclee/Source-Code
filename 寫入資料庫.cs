SqlConnection con=new SqlConnection(scsb.ToString());
con.Open();
String season = "select distinct S_season from student";
SqlDataAdapter adapter4=new SqlDataAdapter(season, con);
DataSet season2=new DataSet();
adapter4.Fill(season2, "S_season");
cb期別.DataSouce=season2.Tables["S_season"];
cb期別.DisplayMember = "S_season";