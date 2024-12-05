public enum Mistakes {
    ZERO_MISTAKE_MEDIUM_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |
                    |
                    |
                    |\
            """),
    ONE_MISTAKE_MEDIUM_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |    o
                    |
                    |
                    |\
            """),
    TWO_MISTAKE_MEDIUM_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |    o
                    |    0
                    |
                    |\
            """),
    THREE_MISTAKE_MEDIUM_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |    o
                    |   /0
                    |
                    |\
            """),
    FOUR_MISTAKE_MEDIUM_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |    o
                    |   /0\\
                    |
                    |\
            """),
    FIVE_MISTAKE_MEDIUM_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |    o
                    |   /0\\
                    |   /
                    |\
            """),
    SIX_MISTAKE_MEDIUM_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |    o
                    |   /0\\
                    |   / \\
                    |
                        YOU DEAD!\
            """),
    ZERO_MISTAKE_HARD_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |
                    |
                    |
                    |\
            """),
    ONE_MISTAKE_HARD_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |    o
                    |
                    |
                    |\
            """),
    TWO_MISTAKE_HARD_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |    o
                    |    0
                    |
                    |\
            """),
    THREE_MISTAKE_HARD_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |    o
                    |   /0\\
                    |
                    |\
            """),
    FOUR_MISTAKE_HARD_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |    o
                    |   /0\\
                    |   / \\
                    |
                        YOU DEAD!\
            """),
    ZERO_MISTAKE_EASY_DIFFICULT("""
                         
                         
                         
                         
                    |
                    |\
            """),
    ONE_MISTAKE_EASY_DIFFICULT("""
                          
                    |     
                    |
                    |
                    |
                    |\
            """),
    TWO_MISTAKE_EASY_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |
                    |
                    |
                    |\
            """),
    THREE_MISTAKE_EASY_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |    o
                    |
                    |
                    |\
            """),
    FOUR_MISTAKE_EASY_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |    o
                    |    0
                    |
                    |\
            """),
    FIVE_MISTAKE_EASY_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |    o
                    |   /0
                    |
                    |\
            """),
    SIX_MISTAKE_EASY_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |    o
                    |   /0\\
                    |
                    |\
            """),
    SEVEN_MISTAKE_EASY_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |    o
                    |   /0\\
                    |   /
                    |\
            """),
    EIGHT_MISTAKE_EASY_DIFFICULT("""
                    ＿＿＿＿
                    |    |
                    |    o
                    |   /0\\
                    |   / \\
                    |
                        YOU DEAD!\
            """);
    Mistakes (String hangman) {
        this.hangman = hangman;
    }
    private String hangman;

    @Override
    public String toString() {
        return hangman;
    }

    public String getHangman() {
        return hangman;
    }
}
