//import React from 'react';
export default (state, action) => {
    switch (action.type) {
        case 'DELETE_TRANSACTION':
            return {
                ...state,
                transactions: state.transactions.filter(transaction => transaction.id !== action.payload)
            }
        case 'ADD_TWEET':
            const newTweet = {
                user: {
                    name: 'SandhiyaJ',
                    image: 'https://pbs.twimg.com/profile_images/1177648329716453376/61dWt1Wx_400x400.jpg',
                    handle: '@ImSandhiyaJ',
                },
                tweet: {
                    content: action.payload,
                   // image: "https://pbs.twimg.com/profile_images/1177648329716453376/61dWt1Wx_400x400.jpg",
                    time: '10m',
                    comments: '100',
                    retweets: '320',
                    likes: '1k'
                }
            };
            return {
                ...state,
                tweets: [...state.tweets, newTweet]
            }
        default:
            return state
    }
}