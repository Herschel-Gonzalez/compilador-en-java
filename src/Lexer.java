// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/Lexer.flex

import compilerTools.Token;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\1"+
    "\1\5\1\0\4\6\1\0\1\7\1\10\1\11\1\0"+
    "\1\12\1\0\1\13\1\14\12\15\1\6\1\16\1\6"+
    "\1\17\3\6\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\25\1\27\2\25\1\30\1\31\1\32\1\25"+
    "\1\33\1\25\1\34\1\35\1\36\1\37\1\40\4\25"+
    "\6\0\32\25\1\41\1\0\1\42\1\6\6\0\1\3"+
    "\33\0\1\6\35\0\1\6\u0168\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\4\1\11\1\12\1\13\4\3\1\4\5\3"+
    "\1\14\1\15\2\16\1\4\1\2\1\16\1\11\1\3"+
    "\1\17\13\3\1\0\2\4\1\20\1\11\1\17\1\21"+
    "\1\3\1\22\4\3\1\0\1\4\1\2\1\20\1\11"+
    "\1\17\3\3\1\23\1\3\1\2\1\24\1\11\2\3"+
    "\1\25\1\24\3\3\1\24\1\16\1\3\1\26\1\27"+
    "\1\24\1\30\1\3\1\24\1\30\1\3\1\24\1\30"+
    "\1\3\1\24\1\30\1\3\1\24\1\30\1\3\1\24"+
    "\1\30\1\3\1\24\1\30\1\3\1\24\1\30\1\3"+
    "\1\24\1\30\1\3\1\24\1\30\1\3\1\24\1\30"+
    "\1\3\1\24\1\30\1\3\1\24\1\30\1\3\1\24"+
    "\1\30\1\3\1\24\1\30\1\3\1\24\1\30\1\3"+
    "\1\24\1\30\1\3\1\24\1\30\1\3\1\24\1\30"+
    "\1\3\1\24\1\30\1\3\1\24\1\30\1\3\1\24"+
    "\1\30\1\3\1\24\1\30\1\3\1\24\1\30\1\3"+
    "\1\24\1\30\1\3\1\24\1\30\1\3\1\24\1\30"+
    "\1\3\1\24\1\30\1\3\1\24\1\30\1\3\1\24"+
    "\1\30\1\3\1\24\1\30\1\3\1\24\1\30\1\3"+
    "\1\24\1\30\1\3\1\24\1\30\1\3\1\24\1\30"+
    "\1\3\1\24\1\30\1\3\1\24\1\30\1\3\1\24"+
    "\1\30\1\3\1\24\1\30\1\3\1\24\1\30\1\3"+
    "\1\24\1\30\1\3\1\24\1\30\1\3\1\24\1\30"+
    "\1\3\1\24\1\30\1\3\1\24\1\30\1\3\1\24"+
    "\1\30\1\3\1\24\1\30\1\3\1\24\1\30\1\3"+
    "\1\24\1\30\1\3\1\24\1\30\1\3\1\24\1\30"+
    "\1\3\1\24\1\30\1\3\1\24\1\30\1\3\1\24"+
    "\1\30\1\3\1\24\1\30\1\3\1\24\1\30\1\3"+
    "\1\24\1\30\1\3\1\24\1\30\1\3\1\24\1\30"+
    "\1\3\1\24\1\30\1\3\1\24\1\30\1\3\1\24"+
    "\1\30\1\3\1\24\1\30\1\3\1\24\1\30\1\3"+
    "\1\24\1\30\1\3\1\24\1\30\1\3\1\24\1\30"+
    "\1\3\1\24\1\30\1\3\1\24\1\30\1\3\1\24"+
    "\1\30\1\3\1\24\1\30\1\3\1\24\1\30\1\3"+
    "\1\24\1\30\1\3\1\24\1\30\1\3\1\24\1\30"+
    "\1\3\1\24\1\30\1\3\1\24\1\30\1\3\1\24"+
    "\1\30\1\3\1\24\1\30\1\3\1\24\1\30\1\3"+
    "\1\24\1\30\1\3\1\24\1\30\1\3\1\24\1\30"+
    "\1\3\1\24\1\30\1\3\1\24\1\30\1\3\1\24"+
    "\1\30\1\3\1\24\1\30\1\3\1\24\1\30\1\3"+
    "\1\24\1\30\1\3\1\24\1\30\1\3\1\24\1\30"+
    "\1\3\1\24\1\30\1\3\1\24\1\30\1\3\1\24"+
    "\1\30\1\3\1\24\6\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[373];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\43\0\43\0\106\0\151\0\151\0\43\0\43"+
    "\0\43\0\214\0\257\0\322\0\43\0\43\0\365\0\u0118"+
    "\0\u013b\0\u015e\0\u0118\0\u0181\0\u01a4\0\u01c7\0\u01ea\0\u020d"+
    "\0\43\0\43\0\214\0\u0230\0\u0253\0\u0276\0\u0299\0\u02bc"+
    "\0\u02df\0\u0302\0\u0325\0\u0348\0\u036b\0\u038e\0\u03b1\0\u03d4"+
    "\0\u03f7\0\u041a\0\u043d\0\u0460\0\u0483\0\u04a6\0\u04c9\0\u04ec"+
    "\0\u050f\0\u0532\0\u0555\0\u0325\0\u0578\0\u0325\0\u059b\0\u05be"+
    "\0\u05e1\0\u0604\0\u0627\0\u064a\0\u04c9\0\u066d\0\u0690\0\u02df"+
    "\0\u06b3\0\u06d6\0\u06f9\0\u0325\0\u071c\0\151\0\u073f\0\u0762"+
    "\0\u0785\0\u07a8\0\u0325\0\u07cb\0\u07ee\0\u0811\0\u0834\0\u0857"+
    "\0\u087a\0\u089d\0\u0325\0\u0325\0\u08c0\0\u08e3\0\u0906\0\u0929"+
    "\0\u094c\0\u096f\0\u0992\0\u09b5\0\u09d8\0\u09fb\0\u0a1e\0\u0a41"+
    "\0\u0a64\0\u0a87\0\u0aaa\0\u0acd\0\u0af0\0\u0b13\0\u0b36\0\u0b59"+
    "\0\u0b7c\0\u0b9f\0\u0bc2\0\u0be5\0\u0c08\0\u0c2b\0\u0c4e\0\u0c71"+
    "\0\u0c94\0\u0cb7\0\u0cda\0\u0cfd\0\u0d20\0\u0d43\0\u0d66\0\u0d89"+
    "\0\u0dac\0\u0dcf\0\u0df2\0\u0e15\0\u0e38\0\u0e5b\0\u0e7e\0\u0ea1"+
    "\0\u0ec4\0\u0ee7\0\u0f0a\0\u0f2d\0\u0f50\0\u0f73\0\u0f96\0\u0fb9"+
    "\0\u0fdc\0\u0fff\0\u1022\0\u1045\0\u1068\0\u108b\0\u10ae\0\u10d1"+
    "\0\u10f4\0\u1117\0\u113a\0\u115d\0\u1180\0\u11a3\0\u11c6\0\u11e9"+
    "\0\u120c\0\u122f\0\u1252\0\u1275\0\u1298\0\u12bb\0\u12de\0\u1301"+
    "\0\u1324\0\u1347\0\u136a\0\u138d\0\u13b0\0\u13d3\0\u13f6\0\u1419"+
    "\0\u143c\0\u145f\0\u1482\0\u14a5\0\u14c8\0\u14eb\0\u150e\0\u1531"+
    "\0\u1554\0\u1577\0\u159a\0\u15bd\0\u15e0\0\u1603\0\u1626\0\u1649"+
    "\0\u166c\0\u168f\0\u16b2\0\u16d5\0\u16f8\0\u171b\0\u173e\0\u1761"+
    "\0\u1784\0\u17a7\0\u17ca\0\u17ed\0\u1810\0\u1833\0\u1856\0\u1879"+
    "\0\u189c\0\u18bf\0\u18e2\0\u1905\0\u1928\0\u194b\0\u196e\0\u1991"+
    "\0\u19b4\0\u19d7\0\u19fa\0\u1a1d\0\u1a40\0\u1a63\0\u1a86\0\u1aa9"+
    "\0\u1acc\0\u1aef\0\u1b12\0\u1b35\0\u1b58\0\u1b7b\0\u1b9e\0\u1bc1"+
    "\0\u1be4\0\u1c07\0\u1c2a\0\u1c4d\0\u1c70\0\u1c93\0\u1cb6\0\u1cd9"+
    "\0\u1cfc\0\u1d1f\0\u1d42\0\u1d65\0\u1d88\0\u1dab\0\u1dce\0\u1df1"+
    "\0\u1e14\0\u1e37\0\u1e5a\0\u1e7d\0\u1ea0\0\u1ec3\0\u1ee6\0\u1f09"+
    "\0\u1f2c\0\u1f4f\0\u1f72\0\u1f95\0\u1fb8\0\u1fdb\0\u1ffe\0\u2021"+
    "\0\u2044\0\u2067\0\u208a\0\u20ad\0\u20d0\0\u20f3\0\u2116\0\u2139"+
    "\0\u215c\0\u217f\0\u21a2\0\u21c5\0\u21e8\0\u220b\0\u222e\0\u2251"+
    "\0\u2274\0\u2297\0\u22ba\0\u22dd\0\u2300\0\u2323\0\u2346\0\u2369"+
    "\0\u238c\0\u23af\0\u23d2\0\u23f5\0\u2418\0\u243b\0\u245e\0\u2481"+
    "\0\u24a4\0\u24c7\0\u24ea\0\u250d\0\u2530\0\u2553\0\u2576\0\u2599"+
    "\0\u25bc\0\u25df\0\u2602\0\u2625\0\u2648\0\u266b\0\u268e\0\u26b1"+
    "\0\u26d4\0\u26f7\0\u271a\0\u273d\0\u2760\0\u2783\0\u27a6\0\u27c9"+
    "\0\u27ec\0\u280f\0\u2832\0\u2855\0\u2878\0\u289b\0\u28be\0\u28e1"+
    "\0\u2904\0\u2927\0\u294a\0\u296d\0\u2990\0\u29b3\0\u29d6\0\u29f9"+
    "\0\u2a1c\0\u2a3f\0\u2a62\0\u2a85\0\u2aa8\0\u2acb\0\u2aee\0\u2b11"+
    "\0\u2b34\0\u2b57\0\u2b7a\0\u2b9d\0\u2bc0\0\u2be3\0\u2c06\0\u2c29"+
    "\0\u2c4c\0\u2c6f\0\u2c92\0\u2cb5\0\u2cd8\0\u2cfb\0\u2d1e\0\u2d41"+
    "\0\u2d64\0\u2d87\0\u2daa\0\u2dcd\0\u2df0\0\u2e13\0\u2e36\0\u2e59"+
    "\0\u2e7c\0\u2e9f\0\u2ec2\0\u2ee5\0\u2f08\0\u2f2b\0\u0230\0\u2f4e"+
    "\0\u2f71\0\u2f94\0\u2fb7\0\u2fda\0\u0230";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[373];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\6\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\2\20\1\21\1\22\1\23\1\20\1\24\1\20\1\25"+
    "\1\20\1\26\1\27\1\30\3\20\1\31\1\32\45\0"+
    "\1\3\45\0\2\6\2\0\1\6\1\0\2\6\3\0"+
    "\21\6\7\0\2\6\2\0\1\6\1\0\1\33\1\6"+
    "\1\34\2\0\21\6\7\0\2\6\2\0\1\35\1\0"+
    "\1\6\1\36\3\0\21\6\15\0\1\37\1\0\1\40"+
    "\2\0\21\41\7\0\2\6\2\0\1\6\1\0\2\6"+
    "\1\42\2\0\3\43\1\44\15\43\7\0\2\6\2\0"+
    "\1\6\1\0\2\6\1\42\2\0\21\43\7\0\2\6"+
    "\2\0\1\6\1\0\2\6\1\42\2\0\4\43\1\45"+
    "\2\43\1\46\11\43\7\0\2\6\2\0\1\6\1\0"+
    "\2\6\1\42\2\0\12\43\1\47\6\43\7\0\2\6"+
    "\2\0\1\6\1\0\2\6\1\42\2\0\12\43\1\50"+
    "\6\43\7\0\2\6\2\0\1\6\1\0\2\6\1\42"+
    "\2\0\17\43\1\51\1\43\7\0\2\6\2\0\1\6"+
    "\1\0\2\6\1\42\2\0\14\43\1\52\4\43\7\0"+
    "\2\6\2\0\1\6\1\0\2\6\1\42\2\0\4\43"+
    "\1\53\14\43\7\0\2\6\2\0\1\6\1\0\2\6"+
    "\1\42\2\0\16\43\1\54\1\55\1\43\15\0\1\34"+
    "\1\0\1\34\25\0\5\56\2\57\2\56\1\60\1\56"+
    "\2\57\3\56\21\57\2\56\2\36\1\3\1\36\1\4"+
    "\36\36\13\0\1\34\1\0\1\61\40\0\1\37\1\0"+
    "\1\62\2\0\21\41\17\0\1\41\2\0\21\41\17\0"+
    "\1\63\2\0\21\41\7\0\2\6\2\0\1\6\1\0"+
    "\2\6\1\41\2\0\21\43\7\0\2\6\2\0\1\6"+
    "\1\0\2\6\1\41\2\0\3\43\1\64\15\43\7\0"+
    "\2\6\2\0\1\6\1\0\2\6\1\41\2\0\2\43"+
    "\1\65\16\43\7\0\2\6\2\0\1\6\1\0\2\6"+
    "\1\41\2\0\20\43\1\64\7\0\2\6\2\0\1\6"+
    "\1\0\2\6\1\41\2\0\3\43\1\66\15\43\7\0"+
    "\2\6\2\0\1\6\1\0\2\6\1\41\2\0\16\43"+
    "\1\67\2\43\7\0\2\6\2\0\1\6\1\0\2\6"+
    "\1\41\2\0\10\43\1\64\10\43\7\0\2\6\2\0"+
    "\1\6\1\0\2\6\1\41\2\0\7\43\1\70\11\43"+
    "\7\0\2\6\2\0\1\6\1\0\2\6\1\41\2\0"+
    "\1\71\20\43\7\0\2\6\2\0\1\6\1\0\2\6"+
    "\1\41\2\0\1\72\20\43\7\0\2\6\2\0\1\6"+
    "\1\0\2\6\1\41\2\0\1\43\1\64\17\43\2\0"+
    "\11\56\1\73\36\56\2\57\2\56\1\74\1\56\2\57"+
    "\3\56\21\57\7\56\2\57\2\56\1\74\1\56\1\57"+
    "\1\75\3\56\21\57\2\56\13\0\1\34\1\0\1\76"+
    "\40\0\1\37\1\0\1\77\2\0\21\41\17\0\1\100"+
    "\2\0\21\41\7\0\2\6\2\0\1\6\1\0\2\6"+
    "\1\41\2\0\7\43\1\101\11\43\7\0\2\6\2\0"+
    "\1\6\1\0\2\6\1\41\2\0\4\43\1\102\14\43"+
    "\7\0\2\6\2\0\1\6\1\0\2\6\1\41\2\0"+
    "\12\43\1\103\6\43\7\0\2\6\2\0\1\6\1\0"+
    "\2\6\1\41\2\0\3\43\1\104\15\43\7\0\2\6"+
    "\2\0\1\6\1\0\2\6\1\41\2\0\14\43\1\105"+
    "\4\43\2\0\11\56\1\73\2\56\1\3\33\56\2\57"+
    "\2\56\1\74\1\56\1\57\1\106\3\56\21\57\2\56"+
    "\13\0\1\34\1\0\1\107\40\0\1\37\1\0\1\110"+
    "\2\0\21\41\7\0\2\6\2\0\1\6\1\0\2\6"+
    "\1\41\2\0\11\43\1\111\7\43\7\0\2\6\2\0"+
    "\1\6\1\0\2\6\1\41\2\0\6\43\1\112\12\43"+
    "\7\0\2\6\2\0\1\6\1\0\2\6\1\41\2\0"+
    "\16\43\1\104\2\43\7\0\2\6\2\0\1\6\1\0"+
    "\2\6\1\41\2\0\16\43\1\113\2\43\15\0\1\34"+
    "\1\0\1\114\40\0\1\37\1\0\1\115\2\0\21\41"+
    "\7\0\2\6\2\0\1\6\1\0\2\6\1\41\2\0"+
    "\1\116\20\43\7\0\2\6\2\0\1\6\1\0\2\6"+
    "\1\41\2\0\4\43\1\117\14\43\15\0\1\34\1\0"+
    "\1\120\40\0\1\121\1\0\1\122\2\0\21\41\7\0"+
    "\2\6\2\0\1\6\1\0\2\6\1\41\2\0\10\43"+
    "\1\123\10\43\7\0\2\6\2\0\1\6\1\0\2\6"+
    "\1\41\2\0\14\43\1\124\4\43\15\0\1\34\1\0"+
    "\1\125\40\0\1\34\1\0\1\126\40\0\1\121\1\0"+
    "\1\127\2\0\21\41\15\0\1\34\1\0\1\130\40\0"+
    "\1\34\1\0\1\131\40\0\1\121\1\0\1\132\2\0"+
    "\21\41\15\0\1\34\1\0\1\133\40\0\1\34\1\0"+
    "\1\134\40\0\1\121\1\0\1\135\2\0\21\41\15\0"+
    "\1\34\1\0\1\136\40\0\1\34\1\0\1\137\40\0"+
    "\1\121\1\0\1\140\2\0\21\41\15\0\1\34\1\0"+
    "\1\141\40\0\1\34\1\0\1\142\40\0\1\121\1\0"+
    "\1\143\2\0\21\41\15\0\1\34\1\0\1\144\40\0"+
    "\1\34\1\0\1\145\40\0\1\121\1\0\1\146\2\0"+
    "\21\41\15\0\1\34\1\0\1\147\40\0\1\34\1\0"+
    "\1\150\40\0\1\121\1\0\1\151\2\0\21\41\15\0"+
    "\1\34\1\0\1\152\40\0\1\34\1\0\1\153\40\0"+
    "\1\121\1\0\1\154\2\0\21\41\15\0\1\34\1\0"+
    "\1\155\40\0\1\34\1\0\1\156\40\0\1\121\1\0"+
    "\1\157\2\0\21\41\15\0\1\34\1\0\1\160\40\0"+
    "\1\34\1\0\1\161\40\0\1\121\1\0\1\162\2\0"+
    "\21\41\15\0\1\34\1\0\1\163\40\0\1\34\1\0"+
    "\1\164\40\0\1\121\1\0\1\165\2\0\21\41\15\0"+
    "\1\34\1\0\1\166\40\0\1\34\1\0\1\167\40\0"+
    "\1\121\1\0\1\170\2\0\21\41\15\0\1\34\1\0"+
    "\1\171\40\0\1\34\1\0\1\172\40\0\1\121\1\0"+
    "\1\173\2\0\21\41\15\0\1\34\1\0\1\174\40\0"+
    "\1\34\1\0\1\175\40\0\1\121\1\0\1\176\2\0"+
    "\21\41\15\0\1\34\1\0\1\177\40\0\1\34\1\0"+
    "\1\200\40\0\1\121\1\0\1\201\2\0\21\41\15\0"+
    "\1\34\1\0\1\202\40\0\1\34\1\0\1\203\40\0"+
    "\1\121\1\0\1\204\2\0\21\41\15\0\1\34\1\0"+
    "\1\205\40\0\1\34\1\0\1\206\40\0\1\121\1\0"+
    "\1\207\2\0\21\41\15\0\1\34\1\0\1\210\40\0"+
    "\1\34\1\0\1\211\40\0\1\121\1\0\1\212\2\0"+
    "\21\41\15\0\1\34\1\0\1\213\40\0\1\34\1\0"+
    "\1\214\40\0\1\121\1\0\1\215\2\0\21\41\15\0"+
    "\1\34\1\0\1\216\40\0\1\34\1\0\1\217\40\0"+
    "\1\121\1\0\1\220\2\0\21\41\15\0\1\34\1\0"+
    "\1\221\40\0\1\34\1\0\1\222\40\0\1\121\1\0"+
    "\1\223\2\0\21\41\15\0\1\34\1\0\1\224\40\0"+
    "\1\34\1\0\1\225\40\0\1\121\1\0\1\226\2\0"+
    "\21\41\15\0\1\34\1\0\1\227\40\0\1\34\1\0"+
    "\1\230\40\0\1\121\1\0\1\231\2\0\21\41\15\0"+
    "\1\34\1\0\1\232\40\0\1\34\1\0\1\233\40\0"+
    "\1\121\1\0\1\234\2\0\21\41\15\0\1\34\1\0"+
    "\1\235\40\0\1\34\1\0\1\236\40\0\1\121\1\0"+
    "\1\237\2\0\21\41\15\0\1\34\1\0\1\240\40\0"+
    "\1\34\1\0\1\241\40\0\1\121\1\0\1\242\2\0"+
    "\21\41\15\0\1\34\1\0\1\243\40\0\1\34\1\0"+
    "\1\244\40\0\1\121\1\0\1\245\2\0\21\41\15\0"+
    "\1\34\1\0\1\246\40\0\1\34\1\0\1\247\40\0"+
    "\1\121\1\0\1\250\2\0\21\41\15\0\1\34\1\0"+
    "\1\251\40\0\1\34\1\0\1\252\40\0\1\121\1\0"+
    "\1\253\2\0\21\41\15\0\1\34\1\0\1\254\40\0"+
    "\1\34\1\0\1\255\40\0\1\121\1\0\1\256\2\0"+
    "\21\41\15\0\1\34\1\0\1\257\40\0\1\34\1\0"+
    "\1\260\40\0\1\121\1\0\1\261\2\0\21\41\15\0"+
    "\1\34\1\0\1\262\40\0\1\34\1\0\1\263\40\0"+
    "\1\121\1\0\1\264\2\0\21\41\15\0\1\34\1\0"+
    "\1\265\40\0\1\34\1\0\1\266\40\0\1\121\1\0"+
    "\1\267\2\0\21\41\15\0\1\34\1\0\1\270\40\0"+
    "\1\34\1\0\1\271\40\0\1\121\1\0\1\272\2\0"+
    "\21\41\15\0\1\34\1\0\1\273\40\0\1\34\1\0"+
    "\1\274\40\0\1\121\1\0\1\275\2\0\21\41\15\0"+
    "\1\34\1\0\1\276\40\0\1\34\1\0\1\277\40\0"+
    "\1\121\1\0\1\300\2\0\21\41\15\0\1\34\1\0"+
    "\1\301\40\0\1\34\1\0\1\302\40\0\1\121\1\0"+
    "\1\303\2\0\21\41\15\0\1\34\1\0\1\304\40\0"+
    "\1\34\1\0\1\305\40\0\1\121\1\0\1\306\2\0"+
    "\21\41\15\0\1\34\1\0\1\307\40\0\1\34\1\0"+
    "\1\310\40\0\1\121\1\0\1\311\2\0\21\41\15\0"+
    "\1\34\1\0\1\312\40\0\1\34\1\0\1\313\40\0"+
    "\1\121\1\0\1\314\2\0\21\41\15\0\1\34\1\0"+
    "\1\315\40\0\1\34\1\0\1\316\40\0\1\121\1\0"+
    "\1\317\2\0\21\41\15\0\1\34\1\0\1\320\40\0"+
    "\1\34\1\0\1\321\40\0\1\121\1\0\1\322\2\0"+
    "\21\41\15\0\1\34\1\0\1\323\40\0\1\34\1\0"+
    "\1\324\40\0\1\121\1\0\1\325\2\0\21\41\15\0"+
    "\1\34\1\0\1\326\40\0\1\34\1\0\1\327\40\0"+
    "\1\121\1\0\1\330\2\0\21\41\15\0\1\34\1\0"+
    "\1\331\40\0\1\34\1\0\1\332\40\0\1\121\1\0"+
    "\1\333\2\0\21\41\15\0\1\34\1\0\1\334\40\0"+
    "\1\34\1\0\1\335\40\0\1\121\1\0\1\336\2\0"+
    "\21\41\15\0\1\34\1\0\1\337\40\0\1\34\1\0"+
    "\1\340\40\0\1\121\1\0\1\341\2\0\21\41\15\0"+
    "\1\34\1\0\1\342\40\0\1\34\1\0\1\343\40\0"+
    "\1\121\1\0\1\344\2\0\21\41\15\0\1\34\1\0"+
    "\1\345\40\0\1\34\1\0\1\346\40\0\1\121\1\0"+
    "\1\347\2\0\21\41\15\0\1\34\1\0\1\350\40\0"+
    "\1\34\1\0\1\351\40\0\1\121\1\0\1\352\2\0"+
    "\21\41\15\0\1\34\1\0\1\353\40\0\1\34\1\0"+
    "\1\354\40\0\1\121\1\0\1\355\2\0\21\41\15\0"+
    "\1\34\1\0\1\356\40\0\1\34\1\0\1\357\40\0"+
    "\1\121\1\0\1\360\2\0\21\41\15\0\1\34\1\0"+
    "\1\361\40\0\1\34\1\0\1\362\40\0\1\121\1\0"+
    "\1\363\2\0\21\41\15\0\1\34\1\0\1\364\40\0"+
    "\1\34\1\0\1\365\40\0\1\121\1\0\1\366\2\0"+
    "\21\41\15\0\1\34\1\0\1\367\40\0\1\34\1\0"+
    "\1\370\40\0\1\121\1\0\1\371\2\0\21\41\15\0"+
    "\1\34\1\0\1\372\40\0\1\34\1\0\1\373\40\0"+
    "\1\121\1\0\1\374\2\0\21\41\15\0\1\34\1\0"+
    "\1\375\40\0\1\34\1\0\1\376\40\0\1\121\1\0"+
    "\1\377\2\0\21\41\15\0\1\34\1\0\1\u0100\40\0"+
    "\1\34\1\0\1\u0101\40\0\1\121\1\0\1\u0102\2\0"+
    "\21\41\15\0\1\34\1\0\1\u0103\40\0\1\34\1\0"+
    "\1\u0104\40\0\1\121\1\0\1\u0105\2\0\21\41\15\0"+
    "\1\34\1\0\1\u0106\40\0\1\34\1\0\1\u0107\40\0"+
    "\1\121\1\0\1\u0108\2\0\21\41\15\0\1\34\1\0"+
    "\1\u0109\40\0\1\34\1\0\1\u010a\40\0\1\121\1\0"+
    "\1\u010b\2\0\21\41\15\0\1\34\1\0\1\u010c\40\0"+
    "\1\34\1\0\1\u010d\40\0\1\121\1\0\1\u010e\2\0"+
    "\21\41\15\0\1\34\1\0\1\u010f\40\0\1\34\1\0"+
    "\1\u0110\40\0\1\121\1\0\1\u0111\2\0\21\41\15\0"+
    "\1\34\1\0\1\u0112\40\0\1\34\1\0\1\u0113\40\0"+
    "\1\121\1\0\1\u0114\2\0\21\41\15\0\1\34\1\0"+
    "\1\u0115\40\0\1\34\1\0\1\u0116\40\0\1\121\1\0"+
    "\1\u0117\2\0\21\41\15\0\1\34\1\0\1\u0118\40\0"+
    "\1\34\1\0\1\u0119\40\0\1\121\1\0\1\u011a\2\0"+
    "\21\41\15\0\1\34\1\0\1\u011b\40\0\1\34\1\0"+
    "\1\u011c\40\0\1\121\1\0\1\u011d\2\0\21\41\15\0"+
    "\1\34\1\0\1\u011e\40\0\1\34\1\0\1\u011f\40\0"+
    "\1\121\1\0\1\u0120\2\0\21\41\15\0\1\34\1\0"+
    "\1\u0121\40\0\1\34\1\0\1\u0122\40\0\1\121\1\0"+
    "\1\u0123\2\0\21\41\15\0\1\34\1\0\1\u0124\40\0"+
    "\1\34\1\0\1\u0125\40\0\1\121\1\0\1\u0126\2\0"+
    "\21\41\15\0\1\34\1\0\1\u0127\40\0\1\34\1\0"+
    "\1\u0128\40\0\1\121\1\0\1\u0129\2\0\21\41\15\0"+
    "\1\34\1\0\1\u012a\40\0\1\34\1\0\1\u012b\40\0"+
    "\1\121\1\0\1\u012c\2\0\21\41\15\0\1\34\1\0"+
    "\1\u012d\40\0\1\34\1\0\1\u012e\40\0\1\121\1\0"+
    "\1\u012f\2\0\21\41\15\0\1\34\1\0\1\u0130\40\0"+
    "\1\34\1\0\1\u0131\40\0\1\121\1\0\1\u0132\2\0"+
    "\21\41\15\0\1\34\1\0\1\u0133\40\0\1\34\1\0"+
    "\1\u0134\40\0\1\121\1\0\1\u0135\2\0\21\41\15\0"+
    "\1\34\1\0\1\u0136\40\0\1\34\1\0\1\u0137\40\0"+
    "\1\121\1\0\1\u0138\2\0\21\41\15\0\1\34\1\0"+
    "\1\u0139\40\0\1\34\1\0\1\u013a\40\0\1\121\1\0"+
    "\1\u013b\2\0\21\41\15\0\1\34\1\0\1\u013c\40\0"+
    "\1\34\1\0\1\u013d\40\0\1\121\1\0\1\u013e\2\0"+
    "\21\41\15\0\1\34\1\0\1\u013f\40\0\1\34\1\0"+
    "\1\u0140\40\0\1\121\1\0\1\u0141\2\0\21\41\15\0"+
    "\1\34\1\0\1\u0142\40\0\1\34\1\0\1\u0143\40\0"+
    "\1\121\1\0\1\u0144\2\0\21\41\15\0\1\34\1\0"+
    "\1\u0145\40\0\1\34\1\0\1\u0146\40\0\1\121\1\0"+
    "\1\u0147\2\0\21\41\15\0\1\34\1\0\1\u0148\40\0"+
    "\1\34\1\0\1\u0149\40\0\1\121\1\0\1\u014a\2\0"+
    "\21\41\15\0\1\34\1\0\1\u014b\40\0\1\34\1\0"+
    "\1\u014c\40\0\1\121\1\0\1\u014d\2\0\21\41\15\0"+
    "\1\34\1\0\1\u014e\40\0\1\34\1\0\1\u014f\40\0"+
    "\1\121\1\0\1\u0150\2\0\21\41\15\0\1\34\1\0"+
    "\1\u0151\40\0\1\34\1\0\1\u0152\40\0\1\121\1\0"+
    "\1\u0153\2\0\21\41\15\0\1\34\1\0\1\u0154\40\0"+
    "\1\34\1\0\1\u0155\40\0\1\121\1\0\1\u0156\2\0"+
    "\21\41\15\0\1\34\1\0\1\u0157\40\0\1\34\1\0"+
    "\1\u0158\40\0\1\121\1\0\1\u0159\2\0\21\41\15\0"+
    "\1\34\1\0\1\u015a\40\0\1\34\1\0\1\u015b\40\0"+
    "\1\121\1\0\1\u015c\2\0\21\41\15\0\1\34\1\0"+
    "\1\u015d\40\0\1\34\1\0\1\u015e\40\0\1\121\1\0"+
    "\1\u015f\2\0\21\41\15\0\1\34\1\0\1\u0160\40\0"+
    "\1\34\1\0\1\u0161\40\0\1\121\1\0\1\u0162\2\0"+
    "\21\41\15\0\1\34\1\0\1\u0163\40\0\1\34\1\0"+
    "\1\u0164\40\0\1\121\1\0\1\u0165\2\0\21\41\15\0"+
    "\1\34\1\0\1\u0166\40\0\1\34\1\0\1\u0167\40\0"+
    "\1\121\1\0\1\u0168\2\0\21\41\15\0\1\34\1\0"+
    "\1\u0169\40\0\1\34\1\0\1\u016a\40\0\1\121\1\0"+
    "\1\u016b\2\0\21\41\15\0\1\34\1\0\1\u016c\40\0"+
    "\1\34\1\0\1\u016d\40\0\1\121\1\0\1\u016e\2\0"+
    "\21\41\15\0\1\34\1\0\1\u016f\40\0\1\34\1\0"+
    "\1\u0170\40\0\1\34\1\0\1\u016e\2\0\21\41\15\0"+
    "\1\34\1\0\1\u0171\40\0\1\34\1\0\1\u0172\40\0"+
    "\1\34\1\0\1\u0173\40\0\1\34\1\0\1\u0174\40\0"+
    "\1\34\1\0\1\u0175\25\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[12285];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\3\1\3\11\3\1\2\11\12\1\2\11"+
    "\23\1\1\0\14\1\1\0\u013a\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[373];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return token(yytext(), "tk_ERROR", yyline, yycolumn);
            }
            // fall through
          case 25: break;
          case 2:
            { /*Ignorar*/
            }
            // fall through
          case 26: break;
          case 3:
            { return token(yytext(), "tk_Palabra", yyline, yycolumn);
            }
            // fall through
          case 27: break;
          case 4:
            { return token(yytext(), "tk_NoValida", yyline, yycolumn);
            }
            // fall through
          case 28: break;
          case 5:
            { return token(yytext(), "tk_ParentesisQueAbre", yyline, yycolumn);
            }
            // fall through
          case 29: break;
          case 6:
            { return token(yytext(), "tk_ParentesisQueCierra", yyline, yycolumn);
            }
            // fall through
          case 30: break;
          case 7:
            { return token(yytext(), "tk_Coma", yyline, yycolumn);
            }
            // fall through
          case 31: break;
          case 8:
            { return token(yytext(), "tk_Punto", yyline, yycolumn);
            }
            // fall through
          case 32: break;
          case 9:
            { return token(yytext(), "tk_Numero", yyline, yycolumn);
            }
            // fall through
          case 33: break;
          case 10:
            { return token(yytext(), "tk_PuntoyComa", yyline, yycolumn);
            }
            // fall through
          case 34: break;
          case 11:
            { return token(yytext(), "tk_Igual", yyline, yycolumn);
            }
            // fall through
          case 35: break;
          case 12:
            { return token(yytext(), "tk_LlaveQueAbre", yyline, yycolumn);
            }
            // fall through
          case 36: break;
          case 13:
            { return token(yytext(), "tk_LlaveQueCierra", yyline, yycolumn);
            }
            // fall through
          case 37: break;
          case 14:
            { return token(yytext(), "tk_ValNumeroReal3", yyline, yycolumn);
            }
            // fall through
          case 38: break;
          case 15:
            { return token(yytext(), "tk_Identificador", yyline, yycolumn);
            }
            // fall through
          case 39: break;
          case 16:
            { return token(yytext(), "tk_NumeroReal", yyline, yycolumn);
            }
            // fall through
          case 40: break;
          case 17:
            { return token(yytext(), "tk_Operador", yyline, yycolumn);
            }
            // fall through
          case 41: break;
          case 18:
            { return token(yytext(), "tk_Final", yyline, yycolumn);
            }
            // fall through
          case 42: break;
          case 19:
            { return token(yytext(), "tk_IO", yyline, yycolumn);
            }
            // fall through
          case 43: break;
          case 20:
            { return token(yytext(), "tk_ValNumeroReal2", yyline, yycolumn);
            }
            // fall through
          case 44: break;
          case 21:
            { return token(yytext(), "tk_Inicio", yyline, yycolumn);
            }
            // fall through
          case 45: break;
          case 22:
            { return token(yytext(), "tk_decimal", yyline, yycolumn);
            }
            // fall through
          case 46: break;
          case 23:
            { return token(yytext(), "tk_entero", yyline, yycolumn);
            }
            // fall through
          case 47: break;
          case 24:
            { return token(yytext(), "tk_ValNumeroReal", yyline, yycolumn);
            }
            // fall through
          case 48: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
