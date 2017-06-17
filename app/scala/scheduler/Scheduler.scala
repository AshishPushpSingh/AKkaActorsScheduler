package scala.scheduler

/**
  * Created by Ashish Pushp Singh on 17/6/17 @AKkaActorsScheduler.
  */
import javax.inject._

import akka.actor._

import scala.concurrent.ExecutionContext
import scala.concurrent.duration._


class Scheduler @Inject()(val system: ActorSystem, @Named("job-bucket-actor") val jobBucketActor: ActorRef)(implicit ec: ExecutionContext) {
 /* parameters to schedule method :schedule(initialDelay,interval,receiver,message)
  * Initial Delay :: is the delay you want since the starting of the application.
  * Interval      :: is the interval after which you want the task to be repeated.
  * Receiver      :: is the instance of the class which had been bind to the actor.
  * Message       :: is the message which decides which action is to be performed.
  */

  system.scheduler.schedule(0.microseconds, 10.seconds, jobBucketActor, "cleanAttachmentBucket")
  system.scheduler.schedule(0.microseconds, 8.seconds, jobBucketActor, "doWhatEverYouWantToDoMan")
}
