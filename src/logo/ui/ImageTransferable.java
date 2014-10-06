package logo.ui;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageTransferable implements Transferable {

	private static final DataFlavor FLAVOR = DataFlavor.imageFlavor;

	private BufferedImage image;
	
	public ImageTransferable(BufferedImage image)
		throws IOException {
		
		this.image = image;
	}
	
	@Override
	public DataFlavor[] getTransferDataFlavors() {
		return new DataFlavor[]{FLAVOR};
	}

	@Override
	public boolean isDataFlavorSupported(DataFlavor flavor) {
		return FLAVOR.equals(flavor);
	}

	@Override
	public Object getTransferData(DataFlavor flavor)
			throws UnsupportedFlavorException, IOException {
		
		return image;
	}

}
