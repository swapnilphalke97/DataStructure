 //	input str
         int N = 256;
    	int count[] = new int[N];
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
        for (int i = 0; i < N; i++)
            if (count[i] > 1)
                System.out.println((char)(i) +
