
    public static void removePaper(){

        System.out.println("ange ID på den tidning du vill ta bort");

        int foundId = input.nextInt();
        input.nextLine()//consumes rest of line.

        for (int i = 0; i < allNewspapers.size();i++){
            if (allNewspapers.get(i).getPaperId()==foundId){
                allNewspapers.remove(i);
                break;
            }
        }


    }
    