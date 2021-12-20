var mysql      = require('mysql');
var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'root',
  password : '123456',
  database : 'react_blog'
});
 
connection.connect();

var addSql = 'INSERT INTO type (typeName, typeIntroduce) VALUES(?,?)'
var addSqlParams = ['vue', 'it\'s vue']
 
connection.query(addSql, addSqlParams, function (err, result) {
  if(err){
    console.log('[SELECT ERROR] - ',err.message);
    return;
  }

 console.log('--------------------------SELECT----------------------------');
 console.log(result);
 console.log('------------------------------------------------------------\n\n');
});


connection.end();