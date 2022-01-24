import React from 'react';

import { BackIcon, NotificationIcon, MoreIcon, LocationIcon, HyperLinkIcon, Calendericon } from '../../images/svg/svgs';
import { useHistory } from "react-router-dom";
import { SmallAvatar } from '../../images/avatars'

export const ProfileHead = (props) => {

    const history = useHistory();
    return (
        <div>
            <div className="flex-align-center header">
                <div className="left">
                    <button onClick={() => history.goBack()} className="btn p-0">
                        <BackIcon />
                    </button>
                </div>
                <div className="right">
                    <h1 className="m-0">Indian Space Research Organization</h1>
                    <p className="profile-tweet-count m-0">72.3k Tweets</p>
                </div>
            </div>
            <div className="banner-img">
                <img className="w-100" src="https://pbs.twimg.com/profile_banners/787324310754996228/1565286634/1080x360" alt="banner" />

            </div>
            <div className="profile-dp p-1 flex-space-between">

                <a className="profile-avatar"><SmallAvatar width="128" image="https://pbs.twimg.com/profile_images/1177648329716453376/61dWt1Wx_400x400.jpg" /></a>
                <div className="follow-me">
                    <MoreIcon />
                    <NotificationIcon />

                    <button className="btn tweet-btn">Following</button>
                </div>



            </div>
            <div className="p-1">
                <div >
                    <h1 className="m-0">Indian Space Research Organization</h1>
                    <p className="profile-tweet-count m-0">@isro</p>
                </div>
                <div className="profile-description">
                    <p>Welcome to my official page</p>
                </div>
                <div className="profile-description-contact">
                    <a className="location flex-align-center "><LocationIcon /> <span className="bold-dull-para pl-1">Washington, D.C</span></a>

                    <a className="location flex-align-center pl-1"><HyperLinkIcon /> <span className="bold-dull-para pl-1">WhiteHouse.gov</span></a>


                    <a className="location flex-align-center pl-1"><Calendericon /> <span className="bold-dull-para pl-1">Joined january, 2017</span></a>
                </div>
                <div>
                    <h2 className="inline-block pr-1">19</h2><span className="bold-dull-para pr-1">Following</span><h2 className="inline-block pl-1">21.5M</h2><span className="bold-dull-para pl-1">Followers</span>
                </div>
            </div>
        </div>
    )
}
