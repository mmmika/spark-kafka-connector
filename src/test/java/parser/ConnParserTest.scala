package parser
import parser.ConnLogParser

/**
  * Created by hungdv on 09/03/2017.
  */
object ConnParserTest {
  def main(args: Array[String]): Unit ={

    val connLogExample1 = "06:59:59 00001334 Auth-Local:Reject: Sgfdl-150825-040, Result 5, Out Of Office (70:d9:31:56:e0:be)"
    val connLogExample2 = "06:59:59 00000464 Auth-Local:SignIn: Kgdsl-130727-700, KGG-MP01-1, 64AFA38A"
    val connLogExample3 = "07:00:00 0000092C Acct-Local:LogOff: Hnfdl-150622-796, HN-MP02-5, 5C6678BE"

    val connParser = new ConnLogParser()
    val line1      = connParser.extractValues(connLogExample1).get
    println("line1: " + line1)

    val line2      = connParser.extractValues(connLogExample2).get
    println("line2: " + line2)

    val line3      = connParser.extractValues(connLogExample3).get
    println("line3: " + line3)

  }
}
