# What is this #

This is a simple demo using webSocket.You can chat with other people in the Internet.It is very easy to use.


#Demo#
You can try this [http://119.29.235.127:8080/](http://119.29.235.127:8080/ "sample")



#environment#

- Jdk7+
- Tomcat 7(very important)
- javaee 7
- myeclipse2014(recommend)
- windows or Linux server



#What should I do?#
1. clone or download the code
2. download 3 important jar   [google-collection](http://api.androidhive.info/jar/google-collections-0.8.jar "google-collection")  ,,,   [javaee-api7](http://api.androidhive.info/jar/javaee-api-7.0.jar),,,[json-org](http://api.androidhive.info/jar/json-org.jar)
3. paste them in project's WEB-INF=>lib folder
4. find your ip address
5. open main.js and change following(line 7、8)

    `var socket_url = '119.29.235.127';`


6. You may need to change (line 51) if your project is not at the root folder(for example my project is at the root folder)

	`webSocket = new WebSocket("ws://" + socket_url + ":" + port + "/chat?name=" + name);`

if the progect is at the "web" folder ,you should change like this

	webSocket = new WebSocket("ws://" + socket_url + ":" + port + "/web/chat?name=" + name);




7. upload your project to the server




#Any questions?#
be free to contact me    jackgao.china@gmail.com