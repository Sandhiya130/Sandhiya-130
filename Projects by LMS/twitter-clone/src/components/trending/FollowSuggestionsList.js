import React from 'react'
import { FollowSuggestionCard } from './FollowSuggestionCard';
import '../../styles/FollowList.css';

export const FollowSuggestionsList = () => {
    const whoToFollowList = [
        {
            name: 'Elon MUSK',
            handle: '@elonmusk',
            image: 'https://pbs.twimg.com/profile_images/1474910968157249536/FS8-70Ie_400x400.jpg'
        },
        {
            name: 'Spacex',
            handle: '@SpaceX',
            image: 'https://pbs.twimg.com/profile_images/1082744382585856001/rH_k3PtQ_400x400.jpg'
        },
        {
            name: 'ISRO',
            handle: '@isro',
            image: 'https://pbs.twimg.com/profile_images/1425037544094273536/vwshhGr7_400x400.jpg'
        }, {
            name: 'Microsoft',
            handle: '@Microsoft',
            image: 'https://pbs.twimg.com/profile_images/1454912483248930822/_hO4WPRC_400x400.png'
        }
    ]
    return (

        <>
            <div className="flex-space-between">
                <h1 className="m-0">People you might know</h1>

            </div>
            <div className="follow-cards">
                {whoToFollowList.map(youMightKnow=> (<FollowSuggestionCard youMightKnow={youMightKnow} />))}

            </div>
        </>

    )
}
