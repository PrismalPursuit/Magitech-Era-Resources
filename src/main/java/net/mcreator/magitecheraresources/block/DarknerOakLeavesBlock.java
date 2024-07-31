
package net.mcreator.magitecheraresources.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class DarknerOakLeavesBlock extends LeavesBlock {
	public DarknerOakLeavesBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.GRASS).strength(0.2f).noOcclusion());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 30;
	}
}