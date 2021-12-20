var mysql      = require('mysql');
var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'root',
  password : '123456',
  database : 'react_blog'
});
 
connection.connect();

var delSql = 'DELETE FROM TYPE WHERE TYPENAME = "REACT"'
 
connection.query(delSql, function (err, result) {
  if(err){
    console.log('[DELETE ERROR] - ',err.message);
    return;
  }        

 console.log('--------------------------DELETE----------------------------');
 console.log('DELETE affectedRows',result.affectedRows);
 console.log('-----------------------------------------------------------------\n\n');  
});


connection.end();