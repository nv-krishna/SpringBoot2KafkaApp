# SpringBoot2KafkaApp
In order to get features of Apache Kafka with Spring Boot, we need to apply @EnableKafka at the main class as below.
1) <b>Start Zookeeper</b></br>
cmd>cd C:\kafka</br>
cmd> .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

2) <b>Start Kafka setup</b></br>
cmd> cd C:\kafka</br>
cmd> .\bin\windows\kafka-server-start.bat .\config\server.properties</br>

3) <b>Create a Topic</b></br>
cmd> cd C:\kafka</br>
cmd>.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic myKafkaTest</br>

4) Run Spring Boot Application </br>

5) After starting application Enter below URLs on the Browser and test the results </br>

<pre>
<strong>♦ <span style="background-color: #ccffff;">http://localhost:9090/send?msg=I like</span></strong>
<strong>♥ <span style="background-color: #ccffff;">http://localhost:9090/send?msg=to work on</span></strong>
<strong>♦ <span style="background-color: #ccffff;">http://localhost:9090/send?msg=Kafka</span></strong>
<strong>♥ <span style="background-color: #ccffff;">http://localhost:9090/send?msg=with Spring Boot</span></strong>

<strong>&nbsp; &nbsp;<span style="background-color: #ccffcc;">http://localhost:9090/getAll</span></strong>
</pre>

6) Also check your output in the console. You will see output something like below screen.

<p><img class="aligncenter wp-image-3669 size-full lazyloaded" src="https://i2.wp.com/javatechonline.com/wp-content/uploads/2021/06/KafkaConsoleOutput-1.jpg?resize=640%2C171&amp;ssl=1" alt="Kafka Console Output" width="640" height="171" data-recalc-dims="1" sizes="(max-width: 640px) 100vw, 640px" srcset="https://i2.wp.com/javatechonline.com/wp-content/uploads/2021/06/KafkaConsoleOutput-1.jpg?w=1177&amp;ssl=1 1177w, https://i2.wp.com/javatechonline.com/wp-content/uploads/2021/06/KafkaConsoleOutput-1.jpg?resize=300%2C80&amp;ssl=1 300w, https://i2.wp.com/javatechonline.com/wp-content/uploads/2021/06/KafkaConsoleOutput-1.jpg?resize=1024%2C274&amp;ssl=1 1024w, https://i2.wp.com/javatechonline.com/wp-content/uploads/2021/06/KafkaConsoleOutput-1.jpg?resize=768%2C206&amp;ssl=1 768w, https://i2.wp.com/javatechonline.com/wp-content/uploads/2021/06/KafkaConsoleOutput-1.jpg?resize=600%2C161&amp;ssl=1 600w" data-ll-status="loaded"><noscript></p>
