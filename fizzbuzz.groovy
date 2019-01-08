counter = 0;
while(counter <= 30){
    if(counter % 3 == 0 && counter % 5 == 0){
        println("fizzbuzz");
        counter++;
    } else {
        if(counter % 3 == 0){
            println("fizz");
        } else if (counter % 5 == 0){
            println("buzz");
        } else {
            println(counter);
        }
        counter++;
    }

}