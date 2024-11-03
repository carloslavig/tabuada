public class Main
{
    public static void main(String[] args)
    {
        System.out.printf("Bem vindo a minha simples tabuada usando um for dentro do outro:");
        //Não tem muito o que comentar, é bem intuitivo, só vai
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                System.out.println(j+"x"+i+"="+j*i);
            }
        }
    }
}