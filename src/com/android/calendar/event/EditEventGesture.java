package com.android.calendar.event;

import android.provider.CalendarContract;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.format.Time;

import com.android.calendar.EventInfoFragment;
import com.android.calendar.GeneralPreferences;
import com.android.calendar.Utils;

public class EditEventGesture {

//    private boolean fillModelFromUI() {
//        if (mModel == null) {
//            return false;
//        }
//        mModel.mReminders = EventViewUtils.reminderItemsToReminders(mReminderItems,
//                mReminderMinuteValues, mReminderMethodValues);
//        mModel.mReminders.addAll(mUnsupportedReminders);
//        mModel.normalizeReminders();
//        mModel.mHasAlarm = mReminderItems.size() > 0;
//        mModel.mTitle = mTitleTextView.getText().toString();
//        mModel.mAllDay = mAllDayCheckBox.isChecked();
//        mModel.mLocation = mLocationTextView.getText().toString();
//        mModel.mDescription = mDescriptionTextView.getText().toString();
//        if (TextUtils.isEmpty(mModel.mLocation)) {
//            mModel.mLocation = null;
//        }
//        if (TextUtils.isEmpty(mModel.mDescription)) {
//            mModel.mDescription = null;
//        }
//
//        int status = EventInfoFragment.getResponseFromButtonId(mResponseRadioGroup
//                .getCheckedRadioButtonId());
//        if (status != CalendarContract.Attendees.ATTENDEE_STATUS_NONE) {
//            mModel.mSelfAttendeeStatus = status;
//        }
//
//        if (mAttendeesList != null) {
//            mEmailValidator.setRemoveInvalid(true);
//            mAttendeesList.performValidation();
//            mModel.mAttendeesList.clear();
//            mModel.addAttendees(mAttendeesList.getText().toString(), mEmailValidator);
//            mEmailValidator.setRemoveInvalid(false);
//        }
//
//        // If this was a new event we need to fill in the Calendar information
//        if (mModel.mUri == null) {
//            mModel.mCalendarId = mCalendarsSpinner.getSelectedItemId();
//            int calendarCursorPosition = mCalendarsSpinner.getSelectedItemPosition();
//            if (mCalendarsCursor.moveToPosition(calendarCursorPosition)) {
//                String calendarOwner = mCalendarsCursor.getString(
//                        EditEventHelper.CALENDARS_INDEX_OWNER_ACCOUNT);
//                String calendarName = mCalendarsCursor.getString(
//                        EditEventHelper.CALENDARS_INDEX_DISPLAY_NAME);
//                String defaultCalendar = calendarOwner + "/" + calendarName;
//                Utils.setSharedPreference(
//                        mActivity, GeneralPreferences.KEY_DEFAULT_CALENDAR, defaultCalendar);
//                mModel.mOwnerAccount = calendarOwner;
//                mModel.mOrganizer = calendarOwner;
//                mModel.mCalendarId = mCalendarsCursor.getLong(EditEventHelper.CALENDARS_INDEX_ID);
//            }
//        }
//
//        if (mModel.mAllDay) {
//            // Reset start and end time, increment the monthDay by 1, and set
//            // the timezone to UTC, as required for all-day events.
//            mTimezone = Time.TIMEZONE_UTC;
//            mStartTime.hour = 0;
//            mStartTime.minute = 0;
//            mStartTime.second = 0;
//            mStartTime.timezone = mTimezone;
//            mModel.mStart = mStartTime.normalize(true);
//
//            mEndTime.hour = 0;
//            mEndTime.minute = 0;
//            mEndTime.second = 0;
//            mEndTime.timezone = mTimezone;
//            // When a user see the event duration as "X - Y" (e.g. Oct. 28 - Oct. 29), end time
//            // should be Y + 1 (Oct.30).
//            final long normalizedEndTimeMillis =
//                    mEndTime.normalize(true) + DateUtils.DAY_IN_MILLIS;
//            if (normalizedEndTimeMillis < mModel.mStart) {
//                // mEnd should be midnight of the next day of mStart.
//                mModel.mEnd = mModel.mStart + DateUtils.DAY_IN_MILLIS;
//            } else {
//                mModel.mEnd = normalizedEndTimeMillis;
//            }
//        } else {
//            mStartTime.timezone = mTimezone;
//            mEndTime.timezone = mTimezone;
//            mModel.mStart = mStartTime.toMillis(true);
//            mModel.mEnd = mEndTime.toMillis(true);
//        }
//        mModel.mTimezone = mTimezone;
//        mModel.mAccessLevel = mAccessLevelSpinner.getSelectedItemPosition();
//        // TODO set correct availability value
//        mModel.mAvailability = mAvailabilityValues.get(mAvailabilitySpinner
//                .getSelectedItemPosition());
//
//        // rrrule
//        // If we're making an exception we don't want it to be a repeating
//        // event.
//        if (mModification == EditEventHelper.MODIFY_SELECTED) {
//            mModel.mRrule = null;
//        } else {
//            mModel.mRrule = mRrule;
//        }
//
//        return true;
//    }
}
