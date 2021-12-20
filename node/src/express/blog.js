var express = require('express');
var app = express();

var mysql = require('mysql');
var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'root',
  password : '123456',
  database : 'react_blog'
});

var server = app.listen(8082, function () {
 
  var host = server.address().address
  var port = server.address().port
 
  console.log("应用实例，访问地址为 http://%s:%s", host, port)
 
})

app.get('/types', function (req, res) {
  console.log("types GET 请求")
  connection.connect();

  var sql = 'SELECT * FROM type'
  
  connection.query(sql, function (err, result) {
    if(err) {
      console.log('[SELECT ERROR] - ',err.message)
      return
    }

  console.log('--------------------------SELECT----------------------------');
  console.log(result)
  res.send(result)
  console.log('------------------------------------------------------------\n\n');
  });

  connection.end();
})