package com.epicgames.ue4;

import com.YourCompany.C4IATontaLimpio.OBBDownloaderService;
import com.YourCompany.C4IATontaLimpio.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

