#Step1 specify the base image
FROM alpine

#Step2 Downloadd and install dependencies 
RUN apk add --update redis

#Step3 Setup and startup command 
CMD ["redis-server"]