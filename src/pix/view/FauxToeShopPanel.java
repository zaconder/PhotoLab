package pix.view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

import pix.controller.FauxToeShopController;
import pixLab.classes.ImageDisplay;
import pixLab.classes.Picture;
import java.awt.FlowLayout;

public class FauxToeShopPanel extends JPanel
{
	private FauxToeShopController baseController;
	
	private JComboBox filterBox;
	private JScrollPane imagePane;
	private SpringLayout baseLayout;
	
	private Picture basePicture;
	private Picture resetPicture;
	
	public FauxToeShopPanel(FauxToeShopController baseController)
	{
		this.setBaseController(baseController);
		
		imagePane = new JScrollPane();
		basePicture = new Picture("beach.jpg");
		resetPicture = new Picture("beach.jpg");
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, imagePane, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, imagePane, 20, SpringLayout.WEST, this);
		
		setupPicture();
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		String [] filterArray = {
			
				"testSepiaTone",
				"testRandomChange",
				"testZeroBlue",
				"testZeroRed",
				"testZeroGreen",
				"testKeepOnlyBlue",
				"testKeepOnlyRed",
				"testKeepOnlyGreen",
				"testNegate",
				"testGrayScale",
				"testFixUnderWater",
				"testMirrorVertical",
				"testMirrorTemple",
				"testMirrorArms",
				"testMirrorGull",
				"testMirrorDiagonal",
				"testCollage",
//				"testCopy",
//				"testEdgeDetection",
				"testHorizontal",
				"testHorizontalBottomToTop",
				"resetPicture",
			};
		
			filterBox = new JComboBox(filterArray);
			baseLayout.putConstraint(SpringLayout.NORTH, filterBox, 0, SpringLayout.NORTH, this);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(filterBox);
		this.add(imagePane);
	}
	
	private void setupPicture()
	{
		BufferedImage bufferedPic = basePicture.getBufferedImage();
		ImageDisplay picDisplay = new ImageDisplay(bufferedPic);
		FlowLayout flowLayout = (FlowLayout) picDisplay.getLayout();
		imagePane.setViewportView(picDisplay);
	}
	
	private void resetPicture()
	{
		BufferedImage bufferedPic = resetPicture.getBufferedImage();
		ImageDisplay picDisplay = new ImageDisplay(bufferedPic);
		FlowLayout flowLayout = (FlowLayout) picDisplay.getLayout();
		imagePane.setViewportView(picDisplay);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		filterBox.addItemListener(new ItemListener()
		{
			
			@Override
			public void itemStateChanged(ItemEvent currentEvent)
			{
				if(filterBox.getSelectedIndex() == 0)
				{
					basePicture.sepiaTone();
					setupPicture();
				}
				if(filterBox.getSelectedIndex() == 1)
				{
					basePicture.randomChange();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 2)
				{
					basePicture.zeroBlue();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 3)
				{
					basePicture.zeroRed();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 4)
				{
					basePicture.zeroGreen();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 5)
				{
					basePicture.zeroBlue();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 6)
				{
					basePicture.keepOnlyBlue();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 7)
				{
					basePicture.keepOnlyRed();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 8)
				{
					basePicture.keepOnlyGreen();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 9)
				{
					basePicture.negate();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 10)
				{
					basePicture.greyscale();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 11)
				{
					basePicture.underWater();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 12)
				{
					basePicture.mirrorVertical();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 13)
				{
					basePicture.mirrorTemple();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 14)
				{
					basePicture.mirrorArms();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 15)
				{
					basePicture.mirrorGull();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 16)
				{
					basePicture.mirrorDiagonal();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 17)
				{
					basePicture.createCollage();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 18)
				{
					basePicture.mirrorHorizontal();
					setupPicture();
				}
				else if(filterBox.getSelectedIndex() == 19)
				{
					resetPicture();
				}
				else if(filterBox.getSelectedIndex() == 20)
				{
					basePicture.mirrorHorizontalBottomToTop();
					setupPicture();
				}
			}
		});
	}

	public FauxToeShopController getBaseController()
	{
		return baseController;
	}

	public void setBaseController(FauxToeShopController baseController)
	{
		this.baseController = baseController;
	}
}
