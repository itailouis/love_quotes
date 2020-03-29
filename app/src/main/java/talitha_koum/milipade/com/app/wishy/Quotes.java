package talitha_koum.milipade.com.app.wishy;

import java.util.Random;

/**
 *  * Created by TALITHA_KOUM on 12/11/2017.
 *  * file for the  Wishy.
 *  * in talitha_koum.milipade.com.app.wishy
 *  */
public class Quotes {
    //private static String[] Quote;
    private static Random rnd;
    static String[] Quote = new String[]{"Love harder than any pain you’ve ever felt.",
            "If I know what love is, it is because of you.\n -Hermann Hesse",
            "Love loves to love love. -James Joyce",
            "When love is not madness, it is not love.\n-Pedro Calderon de la Barca",
            "Love is friendship set on fire.\n-Jeremy Taylor",
            "I love you. I am at rest with you. I have come home\n-Dorothy L. Sayers",
            "I have found that if you love life, life will love you back.\n-Arthur Rubinstein",
            "Love is when you meet someone who tells you something new about yourself.\n-Andre Breton",
            "Love is never wrong.-Melissa Etheridge",
            "We love the things we love for what they are.-Robert Frost"
            ,
            "A flower cannot blossom without sunshine, and man cannot live without love. \n-Max Muller",
            "Being in love with you makes every day an interesting one. \n-Unknown",
            "I love you a lottle, its like a little but a lot.\n-Unknown",
            "The giving of love is an education in itself.\n-Eleanor Roosevelt",
            "Speak low, if you speak love.\n-William Shakespeare",
            "If you love it enough, anything will talk with you.-George Washington Carver",
            "Where there is love there is life.\n-Mahatma Gandhi",
            "Love comforteth like sunshine after rain." +
                    "\n-William Shakespeare",
            "Love is a game that two can play and both win." +
                    "\n-Eva Gabor",
            "Loving you never was an option – it was necessity." +
                    "\n-Unknown",
            "A man is already halfway in love with any woman who listens to him." +
                    "\n-Brendan Francis",
            "Your love is all I need to feel complete." +
                    "\n-Unknown",
            "There is more pleasure in loving than in being beloved." +
                    "\n-Thomas Fuller",
            "If music be the food of love, play on." +
                    "\n-William Shakespeare",
            "Stand by your man. Give him two arms to cling to and something warm to come to." +
                    "\n-Tammy Wynette",
            "Love all, trust a few, do wrong to none." +
                    "\n-William Shakespeare",
            "Time doesn’t matter love is forever." +
                    "\n-Unknown",
            "Unable are the loved to die, for love is immortality." +
                    "\n-Emily Dickinson",
            "Love is a better master than duty." +
                    "\n-Albert Einstein",
            "What is love? It is the morning and the evening star." +
                    "\n-Sinclair Lewis",
            "Tis better to have loved and lost, Than never to have loved at all." +
                    "\n-Alfred Tennyson",
            "First love is only a little foolishness and a lot of curiosity." +
                    "\n-George Bernard Shaw",
            "Love’s gift cannot be given, it waits to be accepted." +
                    "\n-Rabindranath Tagore",
            "Genuine love involves not only passion, but also commitment and wisdom." +
                    "\n-Unknown",
            "When love is at its best, one loves so much that he cannot forget." +
                    "\n-Helen Hunt Jackson",
            "It is the time you have wasted for your rose that makes your rose so important." +
                    "\n-Antoine de Saint-Exupéry",
            "Love is a trap. When it appears, we see only its light, not its shadows." +
                    "\n-Paulo Coehlo",
            "Love is an energy which exists of itself. It is its own value." +
                    "\n-Thornton Wilder",
            "Loving you is both my biggest weakness and greatest strength." +
                    "\n-Unknown",
            "Eternity is in love with the productions of time." +
                    "\n-William Blake",
            "If thou must love me, let it be for naught except for love’s sake only."};
    private static String randomQuotes;

    public static String getRandomQuotes() {
        rnd = new Random();
        int randomQuote = rnd.nextInt(Quote.length-1);
        randomQuotes = Quote[randomQuote];
        return randomQuotes;
    }
}
