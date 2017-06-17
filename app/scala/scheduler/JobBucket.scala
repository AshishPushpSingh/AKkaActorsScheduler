package scala.scheduler

/**
  * Created by Ashish Pushp Singh on 17/6/17 @AKkaActorsScheduler.
  */
import java.io.File
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.inject._

import akka.actor.Actor
import org.apache.commons.io.FileUtils
import play.api.Logger

/*
* Job Bucket can have multiple methods which can be invoked by passing different messages from the Scheduler Class.
* As Akka Actors are (generally) invoked by passing messages (Just like switch cases in Java).
*/
@Singleton
class JobBucket extends Actor {
  /*Multiple cases can be defined inside receive method and hence the respective methods can be called.*/
  def receive = {
    case "cleanAttachmentBucket" => clean()
    case "doWhatEverYouWantToDoMan" => doWhatEver()
  }

  /*This is a sample method which cleans a specific directory after the time interval set in Scheduler class.*/
  def clean(): Unit = {
    /*Using Play's Logger.*/
    Logger.info("File Folder Cleanup Running...")
    //Caution Executing  this might clean your Home Folder
    FileUtils.cleanDirectory(new File(System.getProperty("user.home")))
    Logger.info("File Folder Cleanup Completed...!!!")
  }

  def doWhatEver(): Unit = {
    Logger.info("Inside doWhatEver...")
    /* DO WHATEVER YOU  WANT TO DO MAN
    *  DB calls
    *  Business Logic
    *  Cleanup
    *  Maintenance
    *  Call some methods / services
    *  Here, I am just printing current Date. :)
    */
    val dateTimeFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")
    val now: LocalDateTime = LocalDateTime.now
    println("Current Date & Time :: " + dateTimeFormatter.format(now))
    Logger.info("Exiting doWhatEver...!!!")
  }
}
