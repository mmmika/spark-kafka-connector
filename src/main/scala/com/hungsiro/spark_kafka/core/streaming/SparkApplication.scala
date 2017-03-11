package streaming
import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}
/**
  * Created by hungdv on 10/03/2017.
  */
trait SparkApplication {

  def sparkConfig: Map[String,String]

  def withSparkSession(f: SparkSession=> Unit):Unit ={
    val conf = new SparkConf()
    sparkConfig.foreach{case (k,v) => conf.setIfMissing(k,v)}
    val sparkSession = SparkSession.builder().config(conf).getOrCreate()
    f(sparkSession)
  }
}
