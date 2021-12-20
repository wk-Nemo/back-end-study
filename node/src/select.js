var mysql      = require('mysql');
var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'root',
  password : '123456',
  database : 'react_blog'
});
 
connection.connect();

var sql = 'SELECT * FROM article'
 
connection.query(sql, function (err, result, fields) {
  if(err){
    console.log('[SELECT ERROR] - ',err.message);
    return;
  }

 console.log('--------------------------SELECT----------------------------');
 console.log(result);
 console.log('------------------------------------------------------------\n\n');
});


connection.end();