import scala.concurrent.Future
import javax.inject._
import play.api.inject.ApplicationLifecycle

// This creates an `ApplicationStart` object once at start-up and registers hook for shut-down.
@Singleton
class ApplicationStart @Inject() (lifecycle: ApplicationLifecycle) {
  println("App started")
  /* Shut-down hook */
  lifecycle.addStopHook { () =>
    Future.successful(println("App stopped"))
  }
}
