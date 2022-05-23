## Spring Boot Custom Metrics Monitoring with Micrometer, Prometheus & Grafana

* Micrometer exposes metrics from our application
* Prometheus stores the metric data (Time series db)
* Grafana to visualize the data in graphs



### Start Spring Boot App and display custom metrics for prometheus
~~~
curl http://localhost:8080/actuator/prometheus | grep custom
~~~

### Start Prometheus locally in a Docker container
~~~
docker run -d -p 9090:9090 -v appAbsolutePath/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus
~~~

Prometheus local url address: http://localhost:9090

### Start Grafana locally in a Docker container
~~~
docker run -d -p 3000:3000 grafana/grafana
~~~

Grafana local url address: http://localhost:3000  user/pass: admin/admin

Add the local Prometheus as a new datasource and then create a new dashboard to view metrics