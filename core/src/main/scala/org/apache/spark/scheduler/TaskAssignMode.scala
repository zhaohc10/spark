
package org.apache.spark.scheduler

// "RANDOM" and "STICKY" determines which policy is used to assign tasks to a list of workers
object TaskAssignMode extends Enumeration {
  type TaskAssignMode = Value
  val RANDOM, STICKY = Value
}
