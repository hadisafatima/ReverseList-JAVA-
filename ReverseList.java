public static Elements reversedList(Elements start){
        // 1 , 3 , 5 , 7 , 9
        int count = 0 ;
        for (Elements p = start; p != null ; p = p.next){
            count++ ; // 5
        }

        int[] array = new int[count]; // 5
        Elements temp = start ; // 1, 3
        System.out.println("\nIterating array");
        for (int i=0 ; i < count ; i++ , temp = temp.next){
            array[i] = temp.data ; // 1(0), 3(1), 5(2), 7(3), 9(4)
            System.out.println(array[i]);
        }

        // 1(0) ,3(1) ,5(2) ,7(3) ,9(4)
        Elements reverseList = new Elements(array[array.length-1]) ;
        Elements p = reverseList ;
        //       2(index)
        for (int i = array.length-2 ; i >= 0 ; i--){
            p.next = new Elements(array[i]);
            p = p.next ;
        }

        return reverseList ;
    }
