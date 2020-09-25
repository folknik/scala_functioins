import java.time.LocalDate

object MyFunctions {

  def dateRange(startOfRange: String, stopOfRange: String): Seq[LocalDate] = {
    val startDate: LocalDate = LocalDate.parse(startOfRange)
    val stopDate: LocalDate = LocalDate.parse(stopOfRange)
    startDate.toEpochDay.until(stopDate.toEpochDay + 1).map(LocalDate.ofEpochDay)
  }

  def main(args: Array[String]): Unit = {
    val dates: Seq[LocalDate] = dateRange(startOfRange = "2020-01-01", stopOfRange = "2020-01-31")
    dates.foreach(println)
  }

}