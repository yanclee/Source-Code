  private void btn新增資料_Click(object sender, EventArgs e)
        {
            if ((tb姓名.Text.Length > 0) && (tb電話.Text.Length > 0))
            {
                SqlConnection con = new SqlConnection(scsb.ToString());
                con.Open();
                string strSQL = "insert into persons values(@NewName,@NewPhone,@NewAddress,@NewEmail,@NewBirth,@NewMarriage,@NewPoints)";
                SqlCommand cmd = new SqlCommand(strSQL, con);

                cmd.Parameters.AddWithValue("@NewName", tb姓名.Text);
                cmd.Parameters.AddWithValue("@NewPhone", tb電話.Text);
                cmd.Parameters.AddWithValue("@NewAddress", tb地址.Text);
                cmd.Parameters.AddWithValue("@NewEmail", tbEmail.Text);
                cmd.Parameters.AddWithValue("@NewBirth", (DateTime)dtp生日.Value);
                cmd.Parameters.AddWithValue("NewMarriage", (bool)chk婚姻狀態.Checked);
                int int會員點數 = 0;
                Int32.TryParse(tb會員點數.Text, out int會員點數);
                cmd.Parameters.AddWithValue("@NewPoints", int會員點數);

                int rows = cmd.ExecuteNonQuery();
                con.Close();

                MessageBox.Show(string.Format("資料異動完畢, 共影響{0}筆資料", rows));
            } else
            {
                MessageBox.Show("請輸入姓名, 電話");
            }
        }


 [OrderID] INT NOT NULL, 
 [OrderDate] DATE NULL, 
 [SupplierID] NCHAR(10) NULL, 
 [CompanyName] NVARCHAR(50) NULL, 
 [值日生] NVARCHAR(50) NULL,
 [StudentID]   INT    NOT NULL,
 [StudentName] NVARCHAR (50) NULL,
 [ProductID] INT NOT NULL,
 [ProductName] NVARCHAR(50) NULL,
 [UnitPrice] NVARCHAR(50) NULL,