package models

/**
 * Author: yanyang.wang
 * Date: 30/12/2014
 */
case class Product(ean: Long, name: String, desc: String)

object Product {
  var products = Set(
    Product(123456L, "Paperclips Large 1", "Large Plain Pack of 1000"),
    Product(223456L, "Paperclips Large 2", "Large Plain Pack of 2000"),
    Product(323456L, "Paperclips Large 3", "Large Plain Pack of 3000"),
    Product(423456L, "Paperclips Large 4", "Large Plain Pack of 4000"),
    Product(523456L, "Paperclips Large 5", "Large Plain Pack of 5000"),
    Product(623456L, "Paperclips Large 6", "Large Plain Pack of 6000")
  )

  def findAll = products.toList.sortBy(_.ean)
}
