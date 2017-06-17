package scala.scheduler

/**
  * Created by Ashish Pushp Singh on 17/6/17 @AKkaActorsScheduler.
  */
import com.google.inject.AbstractModule
import play.api.libs.concurrent.AkkaGuiceSupport

/*
  Here we created an explicit Module which implements google GUICE abstract class AbstractModule which further
  implements interface Module.
  By Binding the Actor class we are telling the guice injector what should it inject at the time of Dependency Injection.
*/

class JobModule extends AbstractModule with AkkaGuiceSupport {
  def configure() = {
    bindActor[JobBucket]("job-bucket-actor")
    bind(classOf[Scheduler]).asEagerSingleton()
  }
}
