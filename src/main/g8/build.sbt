
# both of these are erroneously asked from the user (but final result is not expanded);
# second one causes result to fail because of the dot
shouldNotExpand1="\$SHOULD_NOT_ASK_BUT_WONT_EXPAND_SO_ITS_KINDA_OK \$THIS_IS_ALSO_NEEDED"
shouldNotExpand2="\$THIS_ALSO_FAILS_BECAUSE_IT_HAS_A_DOT_IN_IT. \$THIS_IS_ALSO_NEEDED"

