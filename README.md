Fortune Droid Social
--------------------

Part of my "Fortune Droid" pet project, which intends to generate semi-amusing fortunes and publishes them to social media. Mostly, it's an excuse for me to mess with managing and deploying a microservice-oriented architecture, authorization and integration with social media platforms, and the like.

### What does it do?

This is still a work in progress.  Eventually, this application will pull fortunes from the [fortune-droid API](https://github.com/joshuapaulallen/fortune-droid) and publish them to social media.


### How do I build and run it?

1. Clone it, and navigate into the project directory.
2. Build it, and containerize it: `$ ./gradlew build docker`
3. Run the docker container: `$ docker run -p 8080:8080 -t org.yourotherleft/fortune-droid-social`
4. Not much else, yet.
