package cse512

object HotzoneUtils {

  def ST_Contains(queryRectangle: String, pointString: String ): Boolean = {
    
    val rectangle = queryRectangle.split(",")
    val rectangle_x1 = rectangle(0).trim().toDouble
    val rectangle_y1 = rectangle(1).trim().toDouble
    val rectangle_x2 = rectangle(2).trim().toDouble
    val rectangle_y2 = rectangle(3).trim().toDouble
    
    val coordinates = pointString.split(",")
    val coord_x = coordinates(0).trim().toDouble
    val coord_y = coordinates(1).trim().toDouble
    
    var (min_x, max_x) =  Min_Max(rectangle_x1, rectangle_x2)
    var (min_y, max_y) =  Min_Max(rectangle_y1, rectangle_y2)
    
    return coord_x >= min_x && coord_x <= max_x && coord_y >= min_y && coord_y <= max_y
    
  }

  def Min_Max(x: Double, y: Double): (Double, Double) = {
     if(x < y) {
       return (x, y)
    } else {
       return (y, x)
    } 
  }

}



