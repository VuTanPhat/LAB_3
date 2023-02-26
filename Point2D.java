package Point2D;

public class Point2D {
		 private float x;
		 private float y;
		 public Point2D()
		 {
			 
		 }
		 public Point2D(float x,float y)
		 {
			 this.x=x;
			 this.y=y;
		 }
		 public String toString()
		 {
			 return "("+this.x+";"+this.y+")";
		 }
		 public void setX(float X)
		 {
			 this.x=x;
		 }
		 public void setY(float Y)
		 {
			 this.y=y;
		 }

		    void setY(float y ) {
		this.x=x;
		    }

		    void setY(float y) {
		this.y=y;
		    }
		}
