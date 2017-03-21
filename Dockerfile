FROM docker/whalesay:latest
ENV http_proxy http://www-proxy.us.oracle.com:80
ENV https_proxy http://www-proxy.us.oracle.com:80
RUN apt-get -y update && apt-get install -y fortunes
CMD /usr/games/fortune -a | cowsay