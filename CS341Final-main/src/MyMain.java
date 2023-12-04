public class MyMain {

	public static void main(String[] args) {

		// TASK 1: CREATE A CANVAS FOR ANIMATION
		Canvas canvas = new Canvas();
		canvas.requestFocus();
		
		//TASK 2:  ADD A USER GAME OBJECT OF TYPE D
		Type_D_GameObject user = new Type_D_GameObject(200, 200);
		user.setVelocity(10);
		canvas.addKeyListener(user);
		canvas.addGameObject(user);
		
		canvas.setDefaultGameObject(user);

		
		//TASK 3: ADD A GAME OBJECT OF TYPE A
		Type_A_GameObject aObject = new Type_A_GameObject(50, 200);
		aObject.setVelocity(10);
		canvas.addKeyListener(aObject);
		canvas.addGameObject(aObject);
		
		//TASK 4: ADD A GAME OBJECT OF TYPE C
		Type_C_GameObject cObject = new Type_C_GameObject(350, 200);
		cObject.setVelocity(10);
		canvas.addKeyListener(cObject);
		canvas.addGameObject(cObject);
		
		//TASK 5: ADD A GAME OBJECT OF TYPE B
		Type_B_GameObject bObject = new Type_B_GameObject(200, 400);
		bObject.setVelocity(10);
		canvas.addKeyListener(bObject);
		canvas.addGameObject(bObject);

		
	}

}

