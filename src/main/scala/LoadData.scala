import org.apache.spark.{SparkConf, SparkContext}

object LoadData {
  def main(args: Array[String]): Unit = {
    System.setProperty("hadoop.home.dir", "C:\\Hadoop")
    val conf = new SparkConf().setAppName("Spark Job for Loading Data").setMaster("local[*]") // local[*] will access all core of your machine
    //val conf = new SparkConf().setAppName("SparkJob")
    val sc = new SparkContext(conf) // Create Spark Context
    // Load local file data
    val emp_data = sc.textFile("C:\\Meera\\SampleJob\\src\\main\\resources\\emp_data") // It will return a RDD
    // Read the records
    println(emp_data.foreach(println))
    //sc.stop()
  }
}


