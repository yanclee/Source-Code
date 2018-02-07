
      //宣告在 class 裡
      SqlConnectionStringBuilder scsb; 

      //宣告在 Form_Load
      scsb = new SqlConnectionStringBuilder();
      scsb.DataSource = @"CR1-07\MSSQLSERVER01"; //改成自己的本機
      scsb.InitialCatalog = "SetLunchSystem0";   //改成自己連接的資料庫
      scsb.IntegratedSecurity = true;
      scsb.ConnectTimeout = 1;

   ////新增

   //將欄位數值，送入到資料庫中
   SqlConnection con = new SqlConnection(scsb.ToString());
   con.Open();
   SqlCommand cmd = con.CreateCommand();
   cmd.CommandType = CommandType.Text;
   //OrderDetails 換成自己的 TABLE ,括號內的數值，改成自己數值對應的欄位
   cmd.CommandText = "insert into OrderDetails values('" + lblStuID.Text + "','" + lblStuName.Text + "','" + cmbxMeals.Text + "','" + lblUP.Text + "','" + nudQty.Value + "','" + lblSubTot.Text + "')";
   cmd.ExecuteNonQuery();
   con.Close();


   xxx.Text  + aaa.Text ... = ListBox.Text


   
  ////刪除

  SqlConnection con = new SqlConnection(scsb.ToString());
  con.Open();
  SqlCommand cmd = con.CreateCommand();
  cmd.CommandType = CommandType.Text;
  //OrderDetails 換成欲刪除資料列的 TABLE
  //stu_id、stu_name、fi_UP、fi_qty 換成 TABLE 裡相對應的欄位
  cmd.CommandText = "delete from OrderDetails where stu_id ='" + listBox1.Text + "' and stu_name ='" + listlBox2.Text + "' and fi_name  ='"+ listBox3.Text+"' and fi_qty ='" + listBox4.Text + "'";
  cmd.ExecuteNonQuery();
  con.close();










   ////以下看情況用

   //以C# ADO.net 連結本機資料庫
   SqlConnection con2 = new SqlConnection(scsb.ToString());
   con2.Open();
   //要送進MSSQL裡頭，進行搜尋的指令，括號後為子查詢
   //fi_name與 Menus 換成自己的TABLE，shop_id、Shops、shop_name換成自己的TABLE，cmbxShops.Text 換成子查詢的條件來源TABLE
   string strSQL2 = "select fi_name from Menus where shop_id in (select shop_id from Shops where shop_name ='" + cmbxShops.Text + "')";
   SqlCommand cmd2 = new SqlCommand(strSQL2, con2);
   SqlDataReader reader2 = cmd2.ExecuteReader();

   while (reader2.Read())
   {

     cmbxMeals.Items.Add(reader2["fi_name"]);
   }

     reader2.Close();



     con2.Close();