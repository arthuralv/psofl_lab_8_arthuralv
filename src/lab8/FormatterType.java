package lab8;

public enum FormatterType {
    UPPER {
        @Override
        public FormatterStrategy getFormatter() {
            // TODO Auto-generated method stub
            return new FormatterUpper();
        }
    },
    LOWER {
        @Override
        public FormatterStrategy getFormatter() {
            // TODO Auto-generated method stub
            return new FormatterLower();
        }
    },
    BOLD {
        @Override
        public FormatterStrategy getFormatter() {
            // TODO Auto-generated method stub
            return new FormatterBold();
        }
    },
    ITALIC {
        @Override
        public FormatterStrategy getFormatter() {
            // TODO Auto-generated method stub
            return new FormatterItalic();
        }
    };

    public abstract FormatterStrategy getFormatter();
}
