package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	public Snake(Location location) {
		Location loc = location;
		loc.y+=1;
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		//1. add a new SnakeSegment object to the snake
		snake.add(new SnakeSegment(snake.get(snake.size()-1).getLocation(), BODY_SIZE));
		System.out.println(snake.size());
	}

	public Location getHeadLocation() {
		//2. return the location of the snake's head
		return head.getLocation();
	}

	public void update() {
		Location location = new Location(getHeadLocation().x,getHeadLocation().y);
		//1. use a switch statement to check on the currentDirection
		//   of the snake and calculate its next x and y position.
		switch(currentDirection) {
		case UP:
			System.out.println(location.y-=1);
			break;
		case DOWN:
			System.out.println(location.y+=1);
			break;
		case LEFT:
			System.out.println(location.x-=1);
			break;
		case RIGHT:
			System.out.println(location.x+=1);
			break;
		}

		//2. Iterate through the SnakeSegments in reverse order
		//2a. Update each snake segment to the location of the segment 
		//    in front of it.
		System.out.println("Snake size: "+snake.size());
		for(int i = snake.size()-1;i>1;i--) {
			System.out.println("old x: "+snake.get(i).getLocation().x+" old y: "+snake.get(i).getLocation().y);
			
			snake.get(i).setLocation(snake.get(i-1).getLocation());
			
			System.out.println("new x: "+snake.get(i-1).getLocation().x+" new y: "+snake.get(i-1).getLocation().y);
			System.out.println("");
		}
		if(snake.size()>1) {
		
		snake.get(1).setLocation(head.getLocation());
		}
		//3. set the location of the head to the new location calculated in step 1
		head.setLocation(location);
		System.out.println("head x: "+location.x+" head y: "+getHeadLocation().y);
		
		

		//4. set canMove to true
		canMove=true;
	}

	public void setDirection(Direction d) {
		//1. set the current direction equal to the passed in Direction only if canMove is true.
		//   set canMove equal to false.
		//   make sure the snake cannot completely reverse directions.
		
		if(canMove) {
		currentDirection = d;
		}
	}

	public void reset(Location loc) {
		//1. clear the snake
		snake  = new ArrayList<SnakeSegment>();
		
		//2. set the location of the head
		head = new SnakeSegment(loc, BODY_SIZE);
		snake.add(head);
		//3. add the head to the snake
		
	}

	public boolean isOutOfBounds() {
		//1. complete the method so it returns true if the head of the snake is outside of the window
		//   and false otherwise
		if(snake.get(0).getLocation().y<0||snake.get(0).getLocation().y>12) {
			return true;
		}
		if(snake.get(0).getLocation().x<0||snake.get(0).getLocation().x>15) {
			return true;
		}
		return false;
	}
	
	public boolean isHeadCollidingWithBody() {
		//1. complete the method so it returns true if the head is located
		//   in the same location as any other body segment
		for(SnakeSegment seg : snake) {
			if(seg.getLocation().equals(snake.get(0).getLocation())&&seg!=snake.get(0)) {
				return true;
			}
		}
		return false;
	}

	public boolean isLocationOnSnake(Location loc) {
		//1. complete the method so it returns true if the passed in
		//   location is located on the snake
		for(SnakeSegment seg : snake) {
			if(seg.getLocation().equals(loc)) {
				return true;
			}
		}
		return false;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
