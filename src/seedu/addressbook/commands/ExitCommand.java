package seedu.addressbook.commands;

/**
 * Terminates the program.
 */
public class ExitCommand extends Command {

    public static final String COMMAND_WORD = "exit";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" + "Exits the program.\n\t"
            + "Example: " + COMMAND_WORD;
    public static final String MESSAGE_EXIT_ACKNOWEDGEMENT = "Exiting Address Book as requested ...";

    /**
	 * *Check whether the data mutates
	 * 
	 * @return true if the data mutates
	 */
	public boolean isMutating() {
		return false;
	};
	
    @Override
    public CommandResult execute() {
        return new CommandResult(MESSAGE_EXIT_ACKNOWEDGEMENT);
    }

}
