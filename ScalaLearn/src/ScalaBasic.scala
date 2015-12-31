import org.apache.log4j.Logger
import org.apache.log4j.Level
import org.apache.spark.{ SparkConf, SparkContext }
import org.apache.spark.rdd.RDD

object ScalaBasic {
  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.OFF)
    System.setProperty("spark.ui.showConsoleProgress", "false")
  }
}