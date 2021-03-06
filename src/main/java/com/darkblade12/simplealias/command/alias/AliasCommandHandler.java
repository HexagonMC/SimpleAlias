package com.darkblade12.simplealias.command.alias;

import com.darkblade12.simplealias.command.CommandHandler;
import com.darkblade12.simplealias.permission.Permission;

public final class AliasCommandHandler extends CommandHandler {
	public AliasCommandHandler() {
		super("alias", 4, Permission.SIMPLEALIAS_MASTER);
	}

	@Override
	protected void registerCommands() {
		register(CreateCommand.class);
		register(SingleCommand.class);
		register(MultipleCommand.class);
		register(MessageCommand.class);
		register(RemoveCommand.class);
		register(RenameCommand.class);
		register(SetCommand.class);
		register(AddCommand.class);
		register(CreateActionCommand.class);
		register(RemoveActionCommand.class);
		register(SetActionCommand.class);
		register(AddActionCommand.class);
		register(ListCommand.class);
		register(DetailsCommand.class);
		register(ReloadCommand.class);
	}
}