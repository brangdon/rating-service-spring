## Rating-service - backend spring-boot

Simply run those commands to pull and start app

so pull sources in your directory:

`git pull https://github.com/brangdon/rating-service-spring.git`


`cd rating-shop-react`


`create-react-app .`

### Init mongo db:
To init mongo db with video collection, copy `init_video.js` file into your mongodb directory and then run command:

`mongo < init_video.js`

Data will be stored under `video_database` in `video` collection. It is defined in `init-video.js` and in spring file `application.properties`


### Running app:
To start application type maven command (port 8080):

`mvn spring-boot:run`