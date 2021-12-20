var mysql      = require('mysql');
var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'root',
  password : '123456',
  database : 'react_blog'
});
 
connection.connect();

var updateSql = 'UPDATE TYPE ' +
                'SET TYPEINTRODUCE="学习vue" ' +
                'WHERE TYPENAME="vue"'
 
connection.query(updateSql, function (err, result) {
  if(err){
    console.log('[DELETE ERROR] - ',err.message);
    return;
  }        

 console.log('--------------------------DELETE----------------------------');
 console.log(result);
 console.log('-----------------------------------------------------------------\n\n');  
});


connection.end();