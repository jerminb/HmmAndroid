package com.hmm.services;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

import com.hmm.models.media.Media;
import com.hmm.utils.Utils;
import com.hmm.viewmodels.ImagePath;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arash on 2/2/16.
 */
public class ImageProviderService implements IImageProviderService{

    private Context mContext;

    public ImageProviderService(Context context) {
        mContext = context;
    }

    @Override
    public List<ImagePath> getAllImages() {
        Cursor cursor = mContext.getContentResolver().query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI,
                null,
                null,
                null,
                null);
        return null;
    }

    @Override
    public List<ImagePath> getAllThumbnails() {
        List<ImagePath> list = getThumbnailsForPath(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI);
        return list;
    }

    @Override
    public String getOriginalPathForImageId(long id) {
        return null;
    }

    //
//    @Override
//    public int getCountForAll() {
//        return getCountFor(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//    }
//
//    @Override
//    public int getCountForUri(Uri uri) {
//        return getCountFor(uri);
//    }
//
//
//    @Override
//    public List<String> getAllPathsForLimitOffset(int limit, int offset) {
//        String order = MediaStore.Images.ImageColumns.DATE_ADDED + " DESC";
//        return getThumbnailPathsFor(
//                MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI,
//                null,
//                null,
//                order,
//                limit,
//                offset);
//    }
//
//    @Override
//    public List<String> getAllPathsForLimitOffsetFromURI(Uri uri, int limit, int offset) {
//        String order = MediaStore.Images.ImageColumns.DATE_ADDED + " DESC";
//        return getThumbnailPathsFor(
//                uri,
//                null,
//                null,
//                order,
//                limit,
//                offset);
//    }
//
//    private List<String> getThumbnailPathsFor(Uri uri, String where, String[] whereArgs, String order, int limit, int offset) {
//        List<String> pathList = new ArrayList<String>();
//        String limitQuery = Utils.generateQueryForLimitOffset(limit, offset);
//        Cursor cursor = mContext.getContentResolver().query(uri,
//                mColumns,
//                where,
//                whereArgs,
//                order + limitQuery);
//        if(cursor != null) {
//            while(cursor.moveToNext()) {
//                int column_index = cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA);
//                String path = cursor.getString(column_index);
//                if(Utils.isEmpty(path)) {
//                    pathList.add(path);
//                }
//            }
//            cursor.close();
//        }
//        return pathList;
//    }
//
//    private String getThumbnailForId(long id) {
//        String uriStr = "";
//        Cursor cursor = MediaStore.Images.Thumbnails.queryMiniThumbnail(
//                mContext.getContentResolver(), id,
//                MediaStore.Images.Thumbnails.MINI_KIND,
//                new String[] { MediaStore.Images.Thumbnails.DATA });
//        if( cursor != null) {
//            while(cursor.moveToNext()) {
//                uriStr = cursor.getString( cursor.getColumnIndex( MediaStore.Images.Thumbnails.DATA ) );
//            }
//        }
//        return uriStr;
//    }
    private List<ImagePath> getThumbnailsForPath(Uri uri) {
        List<ImagePath> imagePathList = new ArrayList<ImagePath>();
//        Cursor cursor = MediaStore.Images.Thumbnails.queryMiniThumbnails(
//                mContext.getContentResolver(), uri,
//                MediaStore.Images.Thumbnails.MINI_KIND,
//                null);
        Cursor cursor = MediaStore.Images.Thumbnails.queryMiniThumbnails(mContext.getContentResolver(),
                uri, MediaStore.Images.Thumbnails.MINI_KIND, null);
        if( cursor != null) {
            while(cursor.moveToNext()) {
                imagePathList.add(new ImagePath(
                        cursor.getString( cursor.getColumnIndex( MediaStore.Images.Thumbnails.DATA )),
                        cursor.getLong(cursor.getColumnIndex(MediaStore.Images.Thumbnails.IMAGE_ID))));
            }
        }
        return imagePathList;
    }
//
//    private int getCountFor(Uri uri) {
//        int count = 0;
//        Cursor cursor = mContext.getContentResolver().query(uri,
//                new String[]{ MediaStore.Images.Media._ID },
//                null,
//                null,
//                null);
//        if(cursor != null) {
//            count = cursor.getCount();
//        }
//        return count;
//    }
}
